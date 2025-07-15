package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        if (nome == null || nome.trim().isEmpty() || cep == null || cep.trim().isEmpty()) {
            System.err.println("Erro: O nome e o CEP são campos obrigatórios e não podem ser vazios.");
            return;
        }

        try {
            String cidade = CepApi.getInstancia().recuperarCidade(cep);
            String estado = CepApi.getInstancia().recuperarEstado(cep);
            
            if (cidade == null || estado == null) {
                System.err.println("Erro: Não foi possível recuperar a cidade/estado para o CEP '" + cep + "'. Verifique se o CEP é válido.");
                return;
            }

            CrmService.gravarCliente(nome, cep, cidade, estado);
            System.out.println("Sucesso: Cliente '" + nome + "' migrado com o CEP '" + cep + "'.");

        } catch (Exception e) {
            
            System.err.println("Erro inesperado ao tentar migrar o cliente '" + nome + "' com o CEP '" + cep + "'. Detalhes: " + e.getMessage());
        }
    }
}

package entity;

public record ContaRecord(String numeroConta, Double saldo) {
    // records não tem getters e setter
    // existem para transitar dados -> Spring Boot
    // DTO -> Data Transfer Object -> Não tem métodos, apenas dados para criar outros Objetos
}

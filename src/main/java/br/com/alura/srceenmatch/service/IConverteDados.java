package br.com.alura.srceenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe );
}

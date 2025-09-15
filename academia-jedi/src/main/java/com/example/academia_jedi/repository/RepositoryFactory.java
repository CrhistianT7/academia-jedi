package com.example.academia_jedi.repository;

public class RepositoryFactory {
    private static final PadawanRepository PADAWAN_REPOSITORY = new PadawanRepository();

    private RepositoryFactory() {}

    public static PadawanRepository getPadawanRepository() { return PADAWAN_REPOSITORY; }
}

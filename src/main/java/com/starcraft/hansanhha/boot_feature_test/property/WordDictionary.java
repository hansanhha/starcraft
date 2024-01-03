package com.starcraft.hansanhha.boot_feature_test.property;

// 한영 단어사전 인터페이스
public interface WordDictionary {

    String getAll();

    String getWord(String word);

    boolean isSupported(Language language);
}
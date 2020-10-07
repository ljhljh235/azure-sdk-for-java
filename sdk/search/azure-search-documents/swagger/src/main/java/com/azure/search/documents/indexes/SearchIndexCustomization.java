package com.azure.search.documents.indexes;

import com.azure.autorest.postprocessor.ClassCustomization;
import com.azure.autorest.postprocessor.Customization;
import com.azure.autorest.postprocessor.LibraryCustomization;
import com.azure.autorest.postprocessor.PackageCustomization;

public class SearchIndexCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization libraryCustomization) {
        PackageCustomization modelsPackage = libraryCustomization.getPackage("com.azure.search.documents.indexes.models");

//        ClassCustomization cjkBigramTokenFilter = modelsPackage.getModel("CjkBigramTokenFilter");
//        cjkBigramTokenFilter.renameMethod("isOutputUnigrams", "areOutputUnigrams");
//        cjkBigramTokenFilter.addMethodAnnotation("setIgnoreScripts", "@JsonSetter");

        ClassCustomization cognitiveServicesAccount = modelsPackage.getModel("CognitiveServicesAccount");
        cognitiveServicesAccount.changeClassModifier("public abstract");

        ClassCustomization cognitiveServicesAccountKey = modelsPackage.getModel("CognitiveServicesAccountKey");
        cognitiveServicesAccountKey.generateGetterAndSetter("key");

//        ClassCustomization commonGramTokenFilter = modelsPackage.getModel("CommonGramTokenFilter");
//        commonGramTokenFilter.renameProperty("ignoreCase", "caseIgnored");
//        commonGramTokenFilter.renameProperty("useQueryMode", "queryModeUsed");

        ClassCustomization conditionalSkill = modelsPackage.getModel("ConditionalSkill");
        conditionalSkill.removeClassAnnotation("@Immutable");
        conditionalSkill.addClassAnnotation("@Fluent");

        ClassCustomization dataChangeDetectionPolicy = modelsPackage.getModel("DataChangeDetectionPolicy");
        dataChangeDetectionPolicy.changeClassModifier("public abstract");
        dataChangeDetectionPolicy.removeClassAnnotation("@Immutable");
        dataChangeDetectionPolicy.addClassAnnotation("@Fluent");

        ClassCustomization dataDeletionDetectionPolicy = modelsPackage.getModel("DataDeletionDetectionPolicy");
        dataDeletionDetectionPolicy.changeClassModifier("public abstract");
        dataDeletionDetectionPolicy.removeClassAnnotation("@Immutable");
        dataDeletionDetectionPolicy.addClassAnnotation("@Fluent");

//        ClassCustomization dictionaryDecompounderTokenFilter = modelsPackage.getModel("DictionaryDecompounderTokenFilter");
//        dictionaryDecompounderTokenFilter.renameProperty("onlyLongestMatch", "onlyLongestMatched");

//        ClassCustomization keepTokenFilter = modelsPackage.getModel("KeepTokenFilter");
//        keepTokenFilter.renameMethod("isLowerCaseKeepWords", "areLowerCaseKeepWords");

//        ClassCustomization keywordMarkerTokenFilter = modelsPackage.getModel("KeywordMarkerTokenFilter");
//        keywordMarkerTokenFilter.renameProperty("ignoreCase", "caseIgnored");

        ClassCustomization languageDetectionSkill = modelsPackage.getModel("LanguageDetectionSkill");
        languageDetectionSkill.removeClassAnnotation("@Immutable");
        languageDetectionSkill.addClassAnnotation("@Fluent");

        ClassCustomization lexicalAnalyzer = modelsPackage.getModel("LexicalAnalyzer");
        lexicalAnalyzer.changeClassModifier("public abstract");

        PackageCustomization implementationModelsPackage = libraryCustomization.getPackage("com.azure.search.documents.indexes.implementation.models");
        ClassCustomization limitTokenFilter = implementationModelsPackage.getModel("LimitTokenFilter");
        limitTokenFilter.renameProperty("consumeAllTokens", "allTokensConsumed");
        limitTokenFilter.renameMethod("isAllTokensConsumed", "areAllTokensConsumed");

        ClassCustomization magnitudeScoringParameters = modelsPackage.getModel("MagnitudeScoringParameters");
        magnitudeScoringParameters.renameMethod("isShouldBoostBeyondRangeByConstant", "shouldBoostBeyondRangeByConstant");

        ClassCustomization microsoftLanguageStemmingTokenizer = modelsPackage.getModel("MicrosoftLanguageStemmingTokenizer");
        microsoftLanguageStemmingTokenizer.renameProperty("isSearchTokenizer", "isSearchTokenizerUsed");
        microsoftLanguageStemmingTokenizer.renameMethod("isSearchTokenizerUsed", "isSearchTokenizer");

//        ClassCustomization phoneticTokenFilter = modelsPackage.getModel("PhoneticTokenFilter");
//        phoneticTokenFilter.renameProperty("replaceOriginalTokens", "originalTokensReplaced");
//        phoneticTokenFilter.renameMethod("isOriginalTokensReplaced", "areOriginalTokensReplaced");

        ClassCustomization scoringFunction = modelsPackage.getModel("ScoringFunction");
        scoringFunction.changeClassModifier("public abstract");

        ClassCustomization searchIndexerSkill = modelsPackage.getModel("SearchIndexerSkill");
        searchIndexerSkill.changeClassModifier("public abstract");

        ClassCustomization searchResourceEncryptionKey = modelsPackage.getModel("SearchResourceEncryptionKey");
        searchResourceEncryptionKey.renameProperty("vaultUri", "vaultUrl");

        ClassCustomization shaperSkill = modelsPackage.getModel("ShaperSkill");
        shaperSkill.removeClassAnnotation("@Immutable");
        shaperSkill.addClassAnnotation("@Fluent");

        ClassCustomization sqlIntegratedChangeTrackingPolicy = modelsPackage.getModel("SqlIntegratedChangeTrackingPolicy");
        sqlIntegratedChangeTrackingPolicy.removeClassAnnotation("@Immutable");
        sqlIntegratedChangeTrackingPolicy.addClassAnnotation("@Fluent");

        ClassCustomization synonymMap = modelsPackage.getModel("SynonymMap");
        synonymMap.generateGetterAndSetter("name");
        synonymMap.generateGetterAndSetter("synonyms");
    }
}

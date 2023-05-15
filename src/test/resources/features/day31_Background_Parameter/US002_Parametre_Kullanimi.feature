Feature: US002_Amozon_Sayfasinda_Urun_Aratma

  #Classlarimizda kullandigimiz @Before gibi burda da her scenario'dan önce Background:yapisi calisir
  #Her zaman ayni sayfaya gidilecekse yazilir.Örnegin Amazon'a gider

  Background: Kullanici_Amazon_Sayfasina_Gider
    Given kullanici_amazon_sayfasina_gider

  #Feature file'de birden fazla ürün aratmak icin her ürün icin  yeni bir method olusturmak gerekir.
  # Dolayisiyla stepdefinition classinda cok fazla method olusturmus oluruz.
  #Tek bir parametreli method olusturup bunun üstesinden gelebiliriz.
  #Bunun icin feature file'da aratmak istedigim metni "" tirnak icinde yazarsak stepdefinition class'inda bize
  #parametreli method olusturur. Böylece bu methodu kullanarak istedigimiz kadar metin aratabiliriz.

  Scenario: TC01_Amazon_Sayfasinda_Selenium_Aratma
    Then arama_kutusunda_"Selenium"_aratir
    And kullanici 3 saniye bekler


  Scenario: TC02_Amazon_Sayfasinda_Github_Aratma
    Then arama_kutusunda_"github"_aratir
    And kullanici 5 saniye bekler

  Scenario: TC03_Amazon_Sayfasinda_Samsung_Aratma
    Then arama_kutusunda_"samsung"_aratir
    And kullanici 2 saniye bekler
    And sayfayi_kapatir




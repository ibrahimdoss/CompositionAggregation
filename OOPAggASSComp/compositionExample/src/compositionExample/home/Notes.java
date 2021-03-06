package compositionExample.home;

public enum Notes {
	
	/* Ev ile mutfak classları birbirine has-a bağlantılıdır. Yani java'da işlem yaptığımız 
	sınıfta diğer sınıfa ait nesneleri kullanabilmemizi sağlıyor. Diğer sınıfta o nesne için hangi
	özellikleri belirttiysek, işlem yaptığımız sınıfta da nesnenin aynı özelliklerini 
	kullanabilmemizi kolaylaştıracaktır. Compositionlarda parça bütün olarak birbirine tamamiyle 
	bağlıdır. Yani mutfak classı tek başına yaşam döngüsüne devam edemiyor, ev classı olmadan mutfak 
	classı bir anlam ifade etmiyor. Composition mantığın da ise bu iç içe objeleri referanslar 
	sayesinde bunlara erişip kullanabiliyoruz.  */
}

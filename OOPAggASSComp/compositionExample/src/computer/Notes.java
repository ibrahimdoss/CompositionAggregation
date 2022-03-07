package computer;

public enum Notes {
	
	/* Bir classı oluşturduktan sonra başka bir class içerisinde kullanmamızı sağlayan yapıya composition
	diyoruz. Bu sayede aynı kodu yazmak zorunda kalmayacağız ve oluşabilecek kod kirliliğinin önüne
	geçeceğiz.
	
	Compossition da has-A ilişkisi vardır. Bir bilgisayarı OOP ile tasarlarken 
	bir tane Kasa, Anakart, Monitor, Ram vs bunlar birleşerek bir tane bilgisayar objesi oluşturuyorlar.
	Yani kasa, anakart gibi objeler tek başına yaşam döngüsüne devam edemiyor, bilgisayar olduğu sürece
	yaşam döngüsüne devam edebiliyorlar, parça-bütün ilişkisi çok güçlüdür. Yani bilgisayar classı 
	silindiğinde diğer classların da yaşam döngüsüne son verilecektir.   */
}

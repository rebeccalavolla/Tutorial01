public class Dosen {
	//instance variable
    private String nama;
	private String nomorInduk;

    //constructure
    public Dosen (String nama, String nomorInduk) {
        this.nama = nama;
        this.nomorInduk = nomorInduk;
	}

    //method
	public String getNama() {
		return nama;
	}
	
	public String getNomorInduk() {
		return nomorInduk;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setNomorInduk(String nomorInduk) {
		this.nomorInduk = nomorInduk;
	}

}
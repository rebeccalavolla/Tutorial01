public class Mahasiswa {
	//instance variable
    private String nama;
	private String angkatan;
	private String npm;

    //constructure
    public Mahasiswa (String nama, String angkatan, String npm) {
        this.nama = nama;
        this.angkatan = angkatan;
        this.npm = npm;
	}

    //method
	public String getNama() {
		return nama;
	}
	
	public String getAngkatan() {
		return angkatan;
	}
	
	public String getNpm() {
		return npm;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setAngkatan(String angkatan) {
		this.angkatan = angkatan;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
}
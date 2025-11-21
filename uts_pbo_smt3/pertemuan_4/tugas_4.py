class Mahasiswa:
    def __init__(self, nama="Tidak ada", umur=0):
        self.nama = nama
        self.umur = umur

    # Copy constructor versi Python (pakai classmethod)
    @classmethod
    def copy(cls, other):
        return cls(other.nama, other.umur)

    def tampil(self):
        print("Nama:", self.nama)
        print("Umur:", self.umur)


# Simulasi
m1 = Mahasiswa()  # default
print("Object m1:")
m1.tampil()

m2 = Mahasiswa("Budi", 21)  # parameterized
print("\nObject m2:")
m2.tampil()

m3 = Mahasiswa.copy(m2)  # copy
print("\nObject m3 (copy dari m2):")
m3.tampil()
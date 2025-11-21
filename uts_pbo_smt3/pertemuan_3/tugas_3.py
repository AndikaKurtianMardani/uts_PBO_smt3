class Mahasiswa:
    def __init__(self):
        self._nama = ""
        self._nim = ""

    def set_nama(self, nama):
        self._nama = nama

    def get_nama(self):
        return self._nama

    def set_nim(self, nim):
        if len(nim) == 10 and nim.isdigit():
            self._nim = nim
        else:
            print("NIM harus 10 digit angka.")

    def get_nim(self):
        return self._nim


# Contoh penggunaan
m = Mahasiswa()
m.set_nama("Budi")
m.set_nim("2023123456")

print("Nama:", m.get_nama())
print("NIM :", m.get_nim())
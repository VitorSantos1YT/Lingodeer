import hashlib
import zipfile

def get_apk_sha1(apk_path):
    try:
        with zipfile.ZipFile(apk_path, 'r') as zip_ref:
            # Procura o ficheiro de assinatura (.RSA ou .DSA) na pasta META-INF
            cert_files = [f for f in zip_ref.namelist() if f.startswith('META-INF/') and (f.endswith('.RSA') or f.endswith('.DSA'))]
            
            if not cert_files:
                print("[!] Ficheiro de assinatura não encontrado em META-INF.")
                return
            
            cert_data = zip_ref.read(cert_files[0])
            sha1_hash = hashlib.sha1(cert_data).hexdigest().upper()
            
            print(f"\n[+] Hash SHA-1 completo: {sha1_hash}")
            print(f"[+] Primeiros 16 caracteres (Chave AES): {sha1_hash[:16]}\n")
            
    except Exception as e:
        print(f"[!] Erro ao ler o APK: {e}")

get_apk_sha1('/storage/emulated/0/base.apk')

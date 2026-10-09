import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import unpad

def try_decrypt(key_str, ciphertext_b64):
    try:
        # Garante que a chave tenha exatamente 16 bytes
        key_bytes = key_str.encode('utf-8')[:16]
        if len(key_bytes) < 16:
            key_bytes = key_bytes.ljust(16, b'\x00')
            
        cipher = AES.new(key_bytes, AES.MODE_ECB)
        decrypted = unpad(cipher.decrypt(base64.b64decode(ciphertext_b64)), AES.block_size)
        return decrypted.decode('utf-8')
    except Exception:
        return None

sha1_raw = "a3bd91188a0dd13fa7330308201f26c63c67fa89"
texto_cifrado = "MM2nWVjaj1WRdpCBWZH/Bzvq3YEGsNez3bjOE+8UGYQUtEH7fF54mnMjqYAIkv1m"

# Formatos comuns de formatação do SHA-1 em Java/Android
sha1_formatted_upper = ":".join([sha1_raw[i:i+2] for i in range(0, len(sha1_raw), 2)]).upper()
sha1_formatted_lower = ":".join([sha1_raw[i:i+2] for i in range(0, len(sha1_raw), 2)]).lower()

candidatos = [
    sha1_raw[:16],                      # a3bd91188a0dd13f
    sha1_raw[:16].upper(),              # A3BD91188A0DD13F
    sha1_formatted_upper[:16],          # A3:BD:91:18:8A:0D
    sha1_formatted_lower[:16],          # a3:bd:91:18:8a:0d
]

sucesso = False
for i, cand in enumerate(candidatos):
    res = try_decrypt(cand, texto_cifrado)
    if res:
        print(f"[+] Sucesso com o candidato {i+1} ('{cand}'):")
        print(f"    Resultado: {res}")
        sucesso = True
        break

if not sucesso:
    print("[-] Nenhuma das variações padrão da chave SHA-1 funcionou para esta payload.")

import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import unpad

def glide_d_n(input_str: str) -> str:
    """ Reimplementação exata do método com.bumptech.glide.d.n """
    # 1. Base64 (NO_WRAP -> sem quebras de linha '\n')
    b64_bytes = base64.b64encode(input_str.encode('utf-8'))
    b64_str = b64_bytes.decode('utf-8')
    
    # 2. Caesar shift +1
    result = []
    for char in b64_str:
        if char == 'z':
            result.append('a')
        elif char == 'Z':
            result.append('A')
        elif ('a' <= char < 'z') or ('A' <= char < 'Z'):
            result.append(chr(ord(char) + 1))
        else:
            result.append(char)
            
    return "".join(result)

def decrypt_v10_string(key_16bytes: str, base64_ciphertext: str) -> str:
    try:
        key_bytes = key_16bytes.encode('utf-8')
        ciphertext_bytes = base64.b64decode(base64_ciphertext)

        cipher = AES.new(key_bytes, AES.MODE_ECB)
        decrypted_bytes = unpad(cipher.decrypt(ciphertext_bytes), AES.block_size)
        return decrypted_bytes.decode('utf-8')
    except Exception as e:
        return f"[ERRO] {e}"

# 1. Hash SHA-1 real obtido no apksigner (formatado como string de hash normal)
sha1_hash = "a3bd91188a0dd13fa7330308201f26c63c67fa89"

# 2. Passa pela função de transformação e pega os primeiros 16 chars
chave_transformada = glide_d_n(sha1_hash)[:16]
print(f"[+] Chave calculada: {chave_transformada}")

# 3. Testa a descriptografia
texto_cifrado = "MM2nWVjaj1WRdpCBWZH/Bzvq3YEGsNez3bjOE+8UGYQUtEH7fF54mnMjqYAIkv1m"
resultado = decrypt_v10_string(chave_transformada, texto_cifrado)

print(f"[+] Resultado descriptografado: {resultado}")

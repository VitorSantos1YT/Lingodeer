import base64
from Crypto.Cipher import AES
from Crypto.Util.Padding import unpad

def decrypt_v10_string(key_16bytes: str, base64_ciphertext: str) -> str:
    try:
        key_bytes = key_16bytes.encode('utf-8')
        ciphertext_bytes = base64.b64decode(base64_ciphertext)

        cipher = AES.new(key_bytes, AES.MODE_ECB)
        decrypted_bytes = unpad(cipher.decrypt(ciphertext_bytes), AES.block_size)
        return decrypted_bytes.decode('utf-8')
    except Exception as e:
        return f"[ERRO] Falha na descriptografia: {e}"

# Chave real extraída da assinatura SHA-1 do APK
chave = "a3bd91188a0dd13f" 
texto_cifrado = "MM2nWVjaj1WRdpCBWZH/Bzvq3YEGsNez3bjOE+8UGYQUtEH7fF54mnMjqYAIkv1m"

print(decrypt_v10_string(chave, texto_cifrado))

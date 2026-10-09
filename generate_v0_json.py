import os
import json

def find_and_build_v0_schema():
    current_dir = os.getcwd()
    print(f"[*] Buscando arquivos de lições a partir de: {current_dir}")
    
    course_data = {"units": []}
    files_found = 0

    # Varre todo o diretório atual em busca de arquivos de lição/unidade
    for root, _, files in os.walk(current_dir):
        # Ignora a própria pasta do git ou builds temporários do JADX se houver
        if '.git' in root:
            continue
            
        for file in sorted(files):
            # Procura por JSONs que contenham termos típicos de lições/unidades
            if file.endswith('.json') and file != 'v0_prompt_data.json':
                file_path = os.path.join(root, file)
                try:
                    with open(file_path, 'r', encoding='utf-8') as f:
                        content = f.read()
                        # Verifica se o JSON tem estrutura de lição/unidade
                        if 'unit' in content.lower() or 'lesson' in content.lower() or 'mFsource' in file:
                            data = json.loads(content)
                            course_data["units"].append({
                                "file_name": file,
                                "content": data
                            })
                            files_found += 1
                except Exception:
                    pass

    output_file = "v0_prompt_data.json"
    with open(output_file, "w", encoding="utf-8") as out:
        json.dump(course_data, out, ensure_ascii=False, indent=2)

    print(f"\n[+] Concluído!")
    print(f"[+] Total de arquivos de lição encontrados: {files_found}")
    print(f"[+] Arquivo '{output_file}' atualizado na raiz.")

find_and_build_v0_schema()

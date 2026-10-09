import os
import json

def parse_units():
    unit_dir = "assets/unit_info"
    if not os.path.exists(unit_dir):
        print("[-] Pasta assets/unit_info não encontrada.")
        return

    course_summary = {}
    total_languages = 0

    for file_name in sorted(os.listdir(unit_dir)):
        file_path = os.path.join(unit_dir, file_name)
        if os.path.isfile(file_path):
            try:
                with open(file_path, 'r', encoding='utf-8') as f:
                    data = json.load(f)
                    course_summary[file_name] = data
                    total_languages += 1
            except Exception as e:
                # Caso algum arquivo seja binário ou criptografado
                pass

    output_file = "v0_prompt_data.json"
    with open(output_file, "w", encoding="utf-8") as out:
        json.dump(course_summary, out, ensure_ascii=False, indent=2)

    print(f"[+] Sucesso! {total_languages} cursos/idiomas carregados de 'assets/unit_info'.")
    print(f"[+] Arquivo '{output_file}' gerado na raiz.")

parse_units()

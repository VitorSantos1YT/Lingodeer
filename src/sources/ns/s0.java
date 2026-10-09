package ns;

import com.lingodeer.network.model.ApiResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f44021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f44022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(z zVar, t0 t0Var, vy.d dVar) {
        super(2, dVar);
        this.f44021c = zVar;
        this.f44022d = t0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        s0 s0Var = new s0(this.f44021c, this.f44022d, dVar);
        s0Var.f44020b = obj;
        return s0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objL;
        rz.b0 b0Var = (rz.b0) this.f44020b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f44019a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            fr.o0 o0Var = (fr.o0) xt.b.c();
            if (!o0Var.y() || !o0Var.f27733a.showMistakeExplain) {
                return new r0(new f0(), null, BuildConfig.VERSION_NAME, null, ry.r.f50854a);
            }
            h00.s sVar = xt.c.f56291a;
            z zVar = this.f44021c;
            l0 l0Var = new l0(new i0(zVar.f44039b, zVar.f44040c, zVar.f44041d), new o0(zVar.f44042e, zVar.f44043f, zVar.f44044g));
            sVar.getClass();
            String strC = sVar.c(l0.Companion.serializer(), l0Var);
            dv.d dVar = this.f44022d.f44024a;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            h00.d0 element = h00.n.b("user");
            kotlin.jvm.internal.m.f(element, "element");
            h00.d0 element2 = h00.n.b(strC);
            kotlin.jvm.internal.m.f(element2, "element");
            arrayList.add(new h00.z(linkedHashMap));
            h00.e eVar = new h00.e(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            h00.d0 element3 = h00.n.b("application/json");
            kotlin.jvm.internal.m.f(element3, "element");
            h00.m element4 = h00.c.f29915d.d("\n{\n  \"type\": \"object\",\n  \"properties\": {\n    \"header\": {\n      \"type\": \"object\",\n      \"properties\": {\n        \"category\": { \"type\": \"string\" },\n        \"title\": { \"type\": \"string\" },\n        \"subtitle\": { \"type\": \"string\" }\n      },\n      \"required\": [\"category\", \"title\", \"subtitle\"]\n    },\n    \"comparison_view\": {\n      \"type\": \"object\",\n      \"properties\": {\n        \"user_version\": { \"type\": \"string\" },\n        \"correct_version\": { \"type\": \"string\" }\n      },\n      \"required\": [\"user_version\", \"correct_version\"]\n    },\n    \"explanation_md\": { \"type\": \"string\" },\n    \"comparison_table\": {\n      \"type\": \"object\",\n      \"nullable\": true,\n      \"properties\": {\n        \"columns\": { \n          \"type\": \"array\", \n          \"items\": { \"type\": \"string\" },\n          \"minItems\": 2,\n          \"maxItems\": 2\n        },\n        \"data\": { \n          \"type\": \"array\", \n          \"items\": { \n             \"type\": \"array\", \n             \"items\": { \"type\": \"string\" },\n             \"minItems\": 2,\n             \"maxItems\": 2\n          }\n        }\n      },\n      \"required\": [\"columns\", \"data\"]\n    },\n    \"examples\": {\n      \"type\": \"array\",\n      \"maxItems\": 2,\n      \"items\": {\n        \"type\": \"object\",\n        \"properties\": {\n          \"full_translation\": { \"type\": \"string\" },\n          \"tokens\": {\n            \"type\": \"array\",\n            \"items\": {\n              \"type\": \"object\",\n              \"properties\": {\n                \"word\": { \"type\": \"string\" },\n                \"tWord\": { \"type\": \"string\" },\n                \"meaning\": { \"type\": \"string\" },\n                \"reading\": { \"type\": \"string\" },\n                \"romaji\": { \"type\": \"string\" },\n                \"is_highlight\": { \"type\": \"boolean\" }\n              },\n              \"required\": [\"word\", \"tWord\", \"meaning\", \"reading\", \"romaji\", \"is_highlight\"]\n            }\n          }\n        },\n        \"required\": [\"full_translation\", \"tokens\"]\n      }\n    }\n  },\n  \"required\": [\"header\", \"comparison_view\", \"explanation_md\", \"comparison_table\", \"examples\"]\n}\n");
            kotlin.jvm.internal.m.f(element4, "element");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            h00.d0 element5 = h00.n.b("LOW");
            kotlin.jvm.internal.m.f(element5, "element");
            h00.z zVar2 = new h00.z(linkedHashMap2);
            this.f44020b = b0Var;
            this.f44019a = 1;
            obj = dVar.a(eVar, "gemini-3-flash-preview", "\n# Role: Pedagogical Logic Analyzer. Goal: Gap analysis between [User] & [Correct].\n# Input: `[META] TARGET_LANG/UI_LANG`, `[DATA] SOURCE/CORRECT/USER`.\n# Rule: Write Response in `UI_LANG`. Fill `tWord` only if `TARGET_LANG` is Trad-Chinese; else `\"\"`.\n\n# 1. Explanation (Markdown, ELI5)\n- **Style**: Casual, Analogies, NO Jargon. Bold key terms. Max 3-4 sents.\n- **Ref Format**: Native Script (Space-separated Phonetics). Ex: \"**你好** (nǐ hǎo)\", \"**私** (wa ta shi)\".\n- **Structure**:\n  1. `**Category**` (Bold) + Line Break.\n  2. **Body**: Logic gap + trigger.\n  3. **Footer**: `> 💡 **Tip**: ...` (On NEW LINE. Omit if redundant).\n\n# 2. Comparison View (Strict Integrity)\n- **Source**: Copy `USER_RESPONSE` / `CORRECT_ANSWER` exactly.\n- **Action**: Wrap diffs in `<err>` / `<fix>`.\n- **Constraint**: Punctuation/Spaces MUST remain **OUTSIDE** tags. NO dropping chars.\n\n# 3. Comparison Table (Meaning Only, Max 2 Cols)\n- **Show**: Choice Errors (A vs B). **Hide (`null`)**: Omissions, Typos, Punctuation.\n- **Format**: `[\"Term\", \"Diff\"]`. Ex: `[\"China\", \"Country\"]`.\n\n# 4. Examples (JSON)\n- **Novelty**: Must be **NEW** sentences (Do not repeat User/Correct/Source).\n- **Strategy**: \n  - *Confusion*: 2 Sents (1 for Correct Term, 1 for User Term).\n  - *Std Error*: 1 Sent (Correct Term).\n- **Tokenization**: Natural Word segmentation. Punctuation = standalone token.\n- **Highlight**: `true` for the **Focal Concept** of the sentence.\n- **Phonetics & Layout (CRITICAL)**:\n  - **`romaji`**: JP Only (Atomic Space). Else `\"\"`.\n  - **`reading`**: \n    - **ZH (Pinyin) / KR (Rom)**: Atomic Space (`nǐ hǎo` / `sa ram`).\n    - **JP (Kana)**: **NO SPACE** (`にほんじん`).\n", zVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        if (apiResponse instanceof ApiResponse.Error) {
            ApiResponse.Error error = (ApiResponse.Error) apiResponse;
            throw new IllegalStateException("Gemini API 失败: code=" + error.getCode() + ", message=" + error.getMessage());
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = (String) ((ApiResponse.Success) apiResponse).getData();
        if (oz.q.K0(str)) {
            throw new IllegalStateException("Gemini API 返回为空");
        }
        try {
            h00.s sVar2 = xt.c.f56291a;
            sVar2.getClass();
            r0 r0Var = (r0) sVar2.b(r0.Companion.serializer(), str);
            String strQ0 = oz.x.q0(r0Var.f44016c, "\\n", "\n");
            f0 header = r0Var.f44014a;
            y yVar = r0Var.f44015b;
            v vVar = r0Var.f44017d;
            List examples = r0Var.f44018e;
            kotlin.jvm.internal.m.f(header, "header");
            kotlin.jvm.internal.m.f(examples, "examples");
            objL = new r0(header, yVar, strQ0, vVar, examples);
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        Throwable thA = qy.o.a(objL);
        if (thA == null) {
            return objL;
        }
        throw thA;
    }
}

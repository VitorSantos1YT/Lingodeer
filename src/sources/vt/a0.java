package vt;

import com.lingodeer.database.CharacterStrokeDatabase;
import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54173a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f54174b;

    public /* synthetic */ a0(b0 b0Var) {
        this.f54174b = b0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f54173a;
        b0 b0Var = this.f54174b;
        switch (i11) {
            case 0:
                return new File(defpackage.e.m(xt.b.a().e(), "/database"), b0Var.f54180b);
            default:
                re.g0 g0Var = CharacterStrokeDatabase.f22329l;
                String str = b0Var.f54179a;
                LinkedHashMap linkedHashMap = CharacterStrokeDatabase.m;
                CharacterStrokeDatabase characterStrokeDatabase = (CharacterStrokeDatabase) linkedHashMap.get(str);
                if (characterStrokeDatabase != null) {
                    if (characterStrokeDatabase.u()) {
                        characterStrokeDatabase.e();
                    }
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ a0(d0 d0Var, b0 b0Var) {
        this.f54174b = b0Var;
    }
}

package bt;

import android.database.SQLException;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6130c;

    public /* synthetic */ w(Object obj, boolean z11, int i11) {
        this.f6128a = i11;
        this.f6130c = obj;
        this.f6129b = z11;
    }

    @Override // fz.a
    public final Object invoke() {
        uz.o0 o0VarI;
        switch (this.f6128a) {
            case 0:
                jt.g gVar = (jt.g) this.f6130c;
                if (this.f6129b) {
                    gVar.i();
                }
                return qy.b0.f48488a;
            case 1:
                jt.x0 x0Var = (jt.x0) this.f6130c;
                if (this.f6129b) {
                    x0Var.i();
                }
                return qy.b0.f48488a;
            case 2:
                return new a20.a(2, ry.l.l0(new Object[]{(rt.s2) this.f6130c, Boolean.valueOf(this.f6129b)}));
            case 3:
                return new a20.a(2, ry.l.l0(new Object[]{(KOSyllableLesson) this.f6130c, Boolean.valueOf(this.f6129b)}));
            case 4:
                b1.e eVar = (b1.e) this.f6130c;
                boolean z11 = this.f6129b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (z11 && (o0VarI = eVar.i()) != null) {
                    ((uz.w0) o0VarI).d(b0Var);
                }
                return b0Var;
            default:
                y9.e eVar2 = (y9.e) this.f6130c;
                String str = this.f6129b ? "reader" : "writer";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Timed out attempting to acquire a " + str + " connection.");
                sb2.append("\n\nWriter pool:\n");
                eVar2.f57474b.d(sb2);
                sb2.append("Reader pool:");
                sb2.append('\n');
                eVar2.f57473a.d(sb2);
                try {
                    com.bumptech.glide.f.H(5, sb2.toString());
                    throw null;
                } catch (SQLException e8) {
                    e8.printStackTrace();
                    return qy.b0.f48488a;
                }
        }
    }

    public /* synthetic */ w(boolean z11, Object obj, int i11) {
        this.f6128a = i11;
        this.f6129b = z11;
        this.f6130c = obj;
    }
}

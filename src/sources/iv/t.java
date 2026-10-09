package iv;

import am.rVFB.LwKl;
import android.net.Uri;
import com.lingodeer.data.model.CourseCharacter;
import rt.fb;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mv.y f34829b;

    public /* synthetic */ t(mv.y yVar, int i11) {
        this.f34828a = i11;
        this.f34829b = yVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f34828a) {
            case 0:
                CourseCharacter it = (CourseCharacter) obj;
                kotlin.jvm.internal.m.f(it, "it");
                Uri audioUri = it.getAudioUri();
                mv.y yVar = this.f34829b;
                yVar.getClass();
                kotlin.jvm.internal.m.f(audioUri, LwKl.NCMeNSEYK);
                String string = audioUri.toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                if (!oz.q.K0(string)) {
                    yVar.f42291b.h(string);
                }
                break;
            default:
                fb fbVar = (fb) obj;
                i1 i1Var = this.f34829b.f42295f;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, fbVar));
                break;
        }
        return qy.b0.f48488a;
    }
}

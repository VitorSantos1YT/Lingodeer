package vr;

import com.lingodeer.data.model.CourseCharacterGroup;
import java.util.List;
import oz.q;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54146c;

    public /* synthetic */ h(int i11, Object obj, Object obj2) {
        this.f54144a = i11;
        this.f54145b = obj;
        this.f54146c = obj2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f54144a) {
            case 0:
                ((fz.c) this.f54145b).invoke((CourseCharacterGroup) this.f54146c);
                break;
            case 1:
                ((zo.b) this.f54146c).a(new a5.f(1).l((String) q.W0((String) this.f54145b, new String[]{" "}, 0, 6).get(1)));
                break;
            default:
                ((aq.b) this.f54145b).a((String) ((List) this.f54146c).get(1));
                break;
        }
        return b0.f48488a;
    }
}

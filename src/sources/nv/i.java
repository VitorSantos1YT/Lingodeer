package nv;

import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f44146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KOSyllableLesson f44147c;

    public /* synthetic */ i(fz.c cVar, KOSyllableLesson kOSyllableLesson, int i11) {
        this.f44145a = i11;
        this.f44146b = cVar;
        this.f44147c = kOSyllableLesson;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f44145a) {
            case 0:
                this.f44146b.invoke(this.f44147c);
                break;
            default:
                this.f44146b.invoke(this.f44147c);
                break;
        }
        return b0.f48488a;
    }
}

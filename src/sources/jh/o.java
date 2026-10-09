package jh;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.lingo.lingoskill.object.PdLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.c f36373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PdLesson f36374b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MutableLiveData f36377e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9.q f36375c = new n9.q(29, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fv.c f36376d = new fv.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36378f = -1;

    public o(vt.c cVar) {
        this.f36373a = cVar;
    }

    public final MutableLiveData a() {
        MutableLiveData mutableLiveData = this.f36377e;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        kotlin.jvm.internal.m.n("dlStatus");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        if (r15 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r15 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        if (r15 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.lingo.lingoskill.object.PdLesson r14, xy.c r15) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.o.b(com.lingo.lingoskill.object.PdLesson, xy.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f36375c.f();
        this.f36376d.a(this.f36378f);
    }
}

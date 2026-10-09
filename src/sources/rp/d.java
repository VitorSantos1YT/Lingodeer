package rp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import n9.q;
import nv.p;
import oz.x;
import qx.o;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f49336a = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49337b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f49338c = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f49339d = new MutableLiveData();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData f49340e = new MutableLiveData();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fv.c f49341f = new fv.c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f49342t = new q(29, false);

    public final void a(File file) {
        this.f49339d.postValue(100);
        File[] fileArrListFiles = file.getParentFile().listFiles();
        m.e(fileArrListFiles, "listFiles(...)");
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            m.e(name, "getName(...)");
            if (oz.q.v0(name, p.m(this.f49337b, "frus-audiolesson-", "-"), false)) {
                String name2 = file2.getName();
                m.e(name2, "getName(...)");
                if (x.k0(name2, ".mp3", false)) {
                    arrayList.add(file2);
                }
            }
        }
        this.f49340e.postValue(ry.m.c1(ry.m.S0(arrayList, new c())));
    }

    public final void b() {
        qy.q qVar = fv.b.f28186a;
        long j11 = this.f49337b;
        fv.b.w().d(null, null);
        long j12 = this.f49337b;
        fv.b.w().d(null, null);
        yx.d dVarM = new yx.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(18, new fv.a(2L, p.r(fv.g.l(), fv.g.h(), "/z/audiolesson/", p.m(j12, "frus-audiolesson-", ".zip")), "frus-audiolesson-" + j11 + ".zip"), this), 0).M(ky.e.f38937b);
        o oVarA = px.b.a();
        xx.d dVar = new xx.d(a.f49331d, new nf.f(2));
        try {
            dVarM.K(new yx.b(dVar, oVarA));
            j.a(dVar, this.f49342t);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f49342t.f();
    }
}

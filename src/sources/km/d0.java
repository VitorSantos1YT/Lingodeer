package km;

import com.lingo.lingoskill.japanskill.ui.syllable.SyllableIntroductionActivity;
import com.lingo.lingoskill.japanskill.ui.syllable.YinTuActivity;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f38173b;

    public /* synthetic */ d0(File file) {
        this.f38172a = 2;
        this.f38173b = file;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i11 = this.f38172a;
        File file = this.f38173b;
        switch (i11) {
            case 0:
                int i12 = SyllableIntroductionActivity.T;
                if (file.length() != 0) {
                    String parent = file.getParent();
                    kotlin.jvm.internal.m.e(parent, "getParent(...)");
                    ks.b.o(parent, fv.b.D(-1L));
                }
                return Boolean.TRUE;
            case 1:
                int i13 = YinTuActivity.R;
                String parent2 = file.getParent();
                kotlin.jvm.internal.m.e(parent2, "getParent(...)");
                ks.b.o(parent2, fv.b.D(-1L));
                return Boolean.TRUE;
            default:
                int[] iArr = bq.r.f4959a;
                String path = file.getPath();
                kotlin.jvm.internal.m.e(path, "getPath(...)");
                return jh.h.j(bq.m.B(path) / 1000);
        }
    }

    public /* synthetic */ d0(File file, ji.b bVar, int i11) {
        this.f38172a = i11;
        this.f38173b = file;
    }
}

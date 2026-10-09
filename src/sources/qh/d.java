package qh;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.franchskill.ui.learn.FRSyllableIntroductionActivity2;
import com.lingodeer.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import jp.m0;
import jp.p0;
import l1.b1;
import l1.k1;
import lf.x0;
import qp.b2;
import qp.s3;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements tx.c, m0, ki.a, tf.k0, v5.n, ja.b, av.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f47751c;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f47749a = i11;
        this.f47750b = obj;
        this.f47751c = obj2;
    }

    @Override // ki.a
    public void B() {
        int i11 = this.f47749a;
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        switch (this.f47749a) {
            case 1:
                ((TextView) ((p0) ((qp.n) this.f47750b).f47881a).y().findViewById(R.id.txt_answer_txt_2)).setText((SpannableStringBuilder) this.f47751c);
                break;
            default:
                ((TextView) ((p0) ((s3) this.f47750b).f47881a).y().findViewById(R.id.txt_answer_txt_2)).setText((SpannableStringBuilder) this.f47751c);
                break;
        }
    }

    @Override // av.l
    public void a() {
        ((b1) this.f47750b).setValue(null);
        ((b1) this.f47751c).setValue(null);
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f47749a) {
            case 0:
                Long it = (Long) obj;
                e eVar = (e) this.f47751c;
                kotlin.jvm.internal.m.f(it, "it");
                long j11 = 0;
                long j12 = ((kotlin.jvm.internal.x) this.f47750b).f38360a;
                if (j11 > j12) {
                    th.j.a(qx.h.m(j11 - j12, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new x0(eVar, 14), vx.b.f54316e), eVar.f36401t);
                    return;
                }
                sh.b bVar = eVar.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (bVar.f51685t) {
                    eVar.T.set(true);
                    return;
                } else {
                    eVar.C();
                    return;
                }
            case 1:
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((zi.b) this.f47750b).m((RelativeLayout) this.f47751c);
                return;
            case 2:
                Long it3 = (Long) obj;
                View view = (View) this.f47751c;
                kotlin.jvm.internal.m.f(it3, "it");
                b2 b2Var = (b2) this.f47750b;
                if (b2Var.f47854u) {
                    view.startDragAndDrop(null, new vq.c(view), new vq.d(view, b2Var.f47849p), 0);
                    return;
                }
                return;
        }
    }

    @Override // v5.n
    public Object b() {
        return (v5.y) this.f47750b;
    }

    @Override // ja.b
    public ja.a c(String fileName) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        kotlin.jvm.internal.m.f(fileName, "fileName");
        w9.p pVar = (w9.p) this.f47751c;
        if (!fileName.equals(":memory:")) {
            fileName = pVar.f54827c.f54754a.getDatabasePath(fileName).getAbsolutePath();
            kotlin.jvm.internal.m.c(fileName);
        }
        boolean z11 = true;
        x9.a aVar = new x9.a(fileName, (pVar.f54825a || pVar.f54826b || fileName.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = aVar.f55972a;
        reentrantLock.lock();
        d dVar = aVar.f55973b;
        if (dVar != null) {
            try {
                dVar.f();
            } catch (Throwable th2) {
                th = th2;
                z11 = false;
            }
        }
        try {
            try {
                if (pVar.f54826b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                ja.a aVarC = ((ja.b) this.f47750b).c(fileName);
                if (pVar.f54825a) {
                    if (pVar.f54827c.f54760g == w9.r.WRITE_AHEAD_LOGGING) {
                        com.bumptech.glide.f.o(aVarC, "PRAGMA synchronous = NORMAL");
                    } else {
                        com.bumptech.glide.f.o(aVarC, "PRAGMA synchronous = FULL");
                    }
                    w9.p.b(aVarC);
                    pVar.f54828d.d(aVarC);
                } else {
                    try {
                        pVar.f54826b = true;
                        w9.p.a(pVar, aVarC);
                        pVar.f54826b = false;
                    } catch (Throwable th3) {
                        pVar.f54826b = false;
                        throw th3;
                    }
                }
                if (dVar != null && (fileChannel2 = (FileChannel) dVar.f47751c) != null) {
                    try {
                        fileChannel2.close();
                        dVar.f47751c = null;
                    } catch (Throwable th4) {
                        dVar.f47751c = null;
                        throw th4;
                    }
                }
                reentrantLock.unlock();
                return aVarC;
            } catch (Throwable th5) {
                if (dVar != null && (fileChannel = (FileChannel) dVar.f47751c) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        dVar.f47751c = null;
                    }
                }
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        th = th6;
        try {
            if (z11) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + fileName + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th7) {
            reentrantLock.unlock();
            throw th7;
        }
    }

    @Override // v5.n
    public boolean d(CharSequence charSequence, int i11, int i12, v5.v vVar) {
        if ((vVar.f53564c & 4) > 0) {
            return true;
        }
        if (((v5.y) this.f47750b) == null) {
            this.f47750b = new v5.y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((re.q) this.f47751c).getClass();
        ((v5.y) this.f47750b).setSpan(new v5.w(vVar), i11, i12, 33);
        return true;
    }

    public q0 e() {
        return (q0) ((k1) this.f47751c).getValue();
    }

    public void f() throws IOException {
        String str = (String) this.f47750b;
        if (((FileChannel) this.f47751c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f47751c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = (FileChannel) this.f47751c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f47751c = null;
            throw new IllegalStateException(ep.a.g("Unable to lock file: '", str, "'."), th2);
        }
    }

    public int i(vg.l lVar) {
        LinkedHashMap tags = (LinkedHashMap) this.f47751c;
        kotlin.jvm.internal.m.f(tags, "tags");
        String strConcat = lVar.f54042a;
        if (strConcat == null) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.m.e(string, "toString(...)");
            tags.put(string, lVar);
            strConcat = "format:".concat(string);
        }
        return ((j3.e) this.f47750b).h(vg.l.f54040b, strConcat);
    }

    @Override // ki.a
    public void m() {
        switch (this.f47749a) {
            case 4:
                int[] iArr = bq.r.f4959a;
                String str = (String) ((kotlin.jvm.internal.y) this.f47750b).f38361a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                bq.m.L(str, bq.m.r(cf.x.n().keyLanguage) + ":" + bq.m.r(cf.x.n().locateLanguage) + "-ALPHABET.txt");
                Toast.makeText((FRSyllableIntroductionActivity2) this.f47751c, R.string.success, 1).show();
                break;
            default:
                int[] iArr2 = bq.r.f4959a;
                String str2 = (String) ((kotlin.jvm.internal.y) this.f47750b).f38361a;
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                bq.m.L(str2, bq.m.r(cf.x.n().keyLanguage) + ":" + bq.m.r(cf.x.n().locateLanguage) + "-ALPHABET.txt");
                Toast.makeText(((ui.f) this.f47751c).requireContext(), R.string.success, 1).show();
                break;
        }
    }

    @Override // tf.k0
    public Activity n() {
        return (Activity) this.f47751c;
    }

    @Override // tf.k0
    public void startActivityForResult(Intent intent, int i11) {
        b1.p pVar = (b1.p) this.f47750b;
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) pVar.f3800b;
        if (k0Var != null) {
            k0Var.startActivityForResult(intent, i11);
            return;
        }
        Fragment fragment = (Fragment) pVar.f3801c;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i11);
        }
    }

    public d(y2.i0 i0Var, q0 q0Var) {
        this.f47749a = 12;
        this.f47750b = i0Var;
        this.f47751c = l1.t.B(q0Var);
    }

    public d(String str) {
        this.f47749a = 11;
        this.f47750b = str.concat(".lck");
    }

    public d(w9.p pVar, ja.b actual) {
        this.f47749a = 9;
        kotlin.jvm.internal.m.f(actual, "actual");
        this.f47751c = pVar;
        this.f47750b = actual;
    }

    public d() {
        this.f47749a = 8;
        this.f47750b = new j3.e(16);
        this.f47751c = new LinkedHashMap();
    }

    public d(b1.p pVar) {
        this.f47749a = 5;
        this.f47750b = pVar;
        this.f47751c = pVar.w();
    }

    private final void g() {
    }

    private final void h() {
    }
}

package ay;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.lingodeer.R;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements zd.r, yw.a, yw.d, f10.h, androidx.glance.appwidget.protobuf.z, e5.i, ka.c, m20.b, n3.y, p9.q, q7.j, qe.c, q.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k0 f3336b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3337a;

    public /* synthetic */ k0(int i11) {
        this.f3337a = i11;
    }

    public static final void k(m00.e eVar, long j11, boolean z11) {
        m00.e eVar2;
        ReentrantLock reentrantLock = m00.e.f40693h;
        if (m00.e.f40697l == null) {
            m00.e.f40697l = new m00.e();
            dy.m mVar = new dy.m("Okio Watchdog");
            mVar.setDaemon(true);
            mVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j11 != 0 && z11) {
            eVar.f40700g = Math.min(j11, eVar.c() - jNanoTime) + jNanoTime;
        } else if (j11 != 0) {
            eVar.f40700g = j11 + jNanoTime;
        } else {
            if (!z11) {
                throw new AssertionError();
            }
            eVar.f40700g = eVar.c();
        }
        long j12 = eVar.f40700g - jNanoTime;
        m00.e eVar3 = m00.e.f40697l;
        kotlin.jvm.internal.m.c(eVar3);
        while (true) {
            eVar2 = eVar3.f40699f;
            if (eVar2 == null || j12 < eVar2.f40700g - jNanoTime) {
                break;
            }
            kotlin.jvm.internal.m.c(eVar2);
            eVar3 = eVar2;
        }
        eVar.f40699f = eVar2;
        eVar3.f40699f = eVar;
        if (eVar3 == m00.e.f40697l) {
            m00.e.f40694i.signal();
        }
    }

    public static nw.x m(int i11) {
        return new nw.x(new m00.i(), Math.min(1048576, Math.max(4096, i11)));
    }

    public static m00.e n() throws InterruptedException {
        m00.e eVar = m00.e.f40697l;
        kotlin.jvm.internal.m.c(eVar);
        m00.e eVar2 = eVar.f40699f;
        if (eVar2 == null) {
            long jNanoTime = System.nanoTime();
            m00.e.f40694i.await(m00.e.f40695j, TimeUnit.MILLISECONDS);
            m00.e eVar3 = m00.e.f40697l;
            kotlin.jvm.internal.m.c(eVar3);
            if (eVar3.f40699f != null || System.nanoTime() - jNanoTime < m00.e.f40696k) {
                return null;
            }
            return m00.e.f40697l;
        }
        long jNanoTime2 = eVar2.f40700g - System.nanoTime();
        if (jNanoTime2 > 0) {
            m00.e.f40694i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        m00.e eVar4 = m00.e.f40697l;
        kotlin.jvm.internal.m.c(eVar4);
        eVar4.f40699f = eVar2.f40699f;
        eVar2.f40699f = null;
        eVar2.f40698e = 2;
        return eVar2;
    }

    public static long o(int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i11);
        calendar.set(12, i12);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.getTimeInMillis() <= System.currentTimeMillis()) {
            calendar.add(6, 1);
        }
        return calendar.getTimeInMillis();
    }

    public static Typeface r(String str, n3.s sVar, int i11) {
        if (i11 == 0 && kotlin.jvm.internal.m.a(sVar, n3.s.f43178t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iN = ew.a.n(sVar, i11);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iN) : Typeface.create(str, iN);
    }

    @Override // f10.h
    public void a(Level level, String str) {
        System.out.println("[" + level + "] " + str);
    }

    @Override // n3.y
    public Typeface b(n3.u uVar, n3.s sVar, int i11) {
        String strConcat = uVar.f43181f;
        int i12 = sVar.f43179a / 100;
        if (i12 >= 0 && i12 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i12 && i12 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i12 != 4) {
            if (i12 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i12 || i12 >= 8) && 8 <= i12 && i12 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceR = r(strConcat, sVar, i11);
            if (!kotlin.jvm.internal.m.a(typefaceR, Typeface.create(Typeface.DEFAULT, ew.a.n(sVar, i11))) && !kotlin.jvm.internal.m.a(typefaceR, r(null, sVar, i11))) {
                typeface = typefaceR;
            }
        }
        return typeface == null ? r(uVar.f43181f, sVar, i11) : typeface;
    }

    @Override // q7.j
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // m20.b
    public m20.a e(CharSequence charSequence, int i11, int i12) {
        int iN;
        int i13 = i11 + 3;
        if (i13 >= charSequence.length() || charSequence.charAt(i11 + 1) != '/' || charSequence.charAt(i11 + 2) != '/') {
            return null;
        }
        int i14 = -1;
        int i15 = -1;
        for (int i16 = i11 - 1; i16 >= i12; i16--) {
            char cCharAt = charSequence.charAt(i16);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt != '+' && cCharAt != '-' && cCharAt != '.') {
                        break;
                    }
                } else {
                    i15 = i16;
                }
            } else {
                i14 = i16;
            }
        }
        if (i14 > 0 && i14 - 1 == i15) {
            i14 = -1;
        }
        if (i14 == -1 || (iN = se.k.n(charSequence, i13)) == -1) {
            return null;
        }
        return new m20.a(l20.c.URL, i14, iN + 1);
    }

    @Override // p9.q
    public CharSequence f(Preference preference) {
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        ListPreference listPreference = (ListPreference) preference;
        int iE = listPreference.E(listPreference.f2313x0);
        if (TextUtils.isEmpty((iE < 0 || (charSequenceArr2 = listPreference.f2311v0) == null) ? null : charSequenceArr2[iE])) {
            return listPreference.f2319a.getString(R.string.not_set);
        }
        int iE2 = listPreference.E(listPreference.f2313x0);
        if (iE2 < 0 || (charSequenceArr = listPreference.f2311v0) == null) {
            return null;
        }
        return charSequenceArr[iE2];
    }

    @Override // ka.c
    public ka.d g(ka.b bVar) {
        return new la.h(bVar.f38023a, bVar.f38024b, bVar.f38025c, bVar.f38026d, bVar.f38027e);
    }

    @Override // n3.y
    public Typeface h(n3.s sVar, int i11) {
        return r(null, sVar, i11);
    }

    @Override // q7.j
    public long i() {
        throw new NoSuchElementException();
    }

    @Override // qe.c
    public void j(Object obj) {
        ((List) obj).clear();
    }

    @Override // f10.h
    public void l(Level level, String str, Throwable th2) {
        System.out.println("[" + level + "] " + str);
        th2.printStackTrace(System.out);
    }

    @Override // q7.j
    public boolean next() {
        return false;
    }

    @Override // zd.r
    public zd.q p(zd.w wVar) {
        return new ae.h(wVar.b(zd.h.class, InputStream.class), 0);
    }

    @Override // q.u
    public boolean q(q.l lVar) {
        return false;
    }

    public er.f s(Context context) {
        er.f fVar;
        kotlin.jvm.internal.m.f(context, "context");
        er.f fVar2 = er.f.f25750d;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this) {
            fVar = er.f.f25750d;
            if (fVar == null) {
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.m.e(applicationContext, "getApplicationContext(...)");
                fVar = new er.f(applicationContext);
                er.f.f25750d = fVar;
            }
        }
        return fVar;
    }

    public re.f t() {
        re.f fVar;
        re.f fVar2 = re.f.f49142g;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this) {
            fVar = re.f.f49142g;
            if (fVar == null) {
                x6.b bVarA = x6.b.a(re.s.a());
                kotlin.jvm.internal.m.e(bVarA, "getInstance(applicationContext)");
                re.f fVar3 = new re.f(bVarA, new o20.i(19));
                re.f.f49142g = fVar3;
                fVar = fVar3;
            }
        }
        return fVar;
    }

    @Override // yw.d
    public boolean test(Object obj) {
        return true;
    }

    public String toString() {
        switch (this.f3337a) {
            case 2:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    public boolean u(er.e notificationType, long j11, er.a aVar, Context context) {
        kotlin.jvm.internal.m.f(notificationType, "notificationType");
        kotlin.jvm.internal.m.f(context, "context");
        er.f fVarS = s(context);
        AlarmManager alarmManager = (AlarmManager) fVarS.f25752b.getValue();
        if (alarmManager == null) {
            return false;
        }
        try {
            fVarS.a(notificationType);
            PendingIntent pendingIntentB = fVarS.b(notificationType, aVar);
            notificationType.name();
            alarmManager.setAndAllowWhileIdle(0, j11, pendingIntentB);
            notificationType.name();
            return true;
        } catch (Exception unused) {
            notificationType.name();
            return false;
        }
    }

    public k0(Context context) {
        this.f3337a = 10;
    }

    @Override // yw.a
    public void run() {
    }

    @Override // q.u
    public void d(q.l lVar, boolean z11) {
    }
}

package p7;

import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.data.env.Env;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements b7.g, tx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f46370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46374e;

    public /* synthetic */ f0(String str, pp.e eVar, kotlin.jvm.internal.w wVar, boolean z11, hi.a aVar) {
        this.f46371b = str;
        this.f46372c = eVar;
        this.f46373d = wVar;
        this.f46370a = z11;
        this.f46374e = aVar;
    }

    @Override // b7.g
    public void accept(Object obj) {
        k7.c cVar = (k7.c) this.f46371b;
        ((h0) obj).l(cVar.f37956a, cVar.f37957b, (s) this.f46372c, (x) this.f46373d, (IOException) this.f46374e, this.f46370a);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x00ce  */
    @Override // tx.a
    public void run() {
        int i11;
        String cwsId = (String) this.f46371b;
        pp.e eVar = (pp.e) this.f46372c;
        kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f46373d;
        hi.a aVar = (hi.a) this.f46374e;
        ij.i iVarV = se.k.v();
        kotlin.jvm.internal.m.f(cwsId, "cwsId");
        if (((ReviewNew) iVarV.f34435a.f34441a.getReviewNewDao().load(cwsId)) == null) {
            Integer numValueOf = Integer.valueOf(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()));
            kotlin.jvm.internal.m.e(numValueOf, "valueOf(...)");
            String strValueOf = String.valueOf(numValueOf.intValue());
            Env env = eVar.f46980e;
            String notificationWordSent = env.notificationWordSent;
            kotlin.jvm.internal.m.e(notificationWordSent, "notificationWordSent");
            int i12 = 0;
            if (notificationWordSent.length() > 0) {
                String notificationWordSent2 = env.notificationWordSent;
                kotlin.jvm.internal.m.e(notificationWordSent2, "notificationWordSent");
                if (kotlin.jvm.internal.m.a((String) oz.q.W0(notificationWordSent2, new String[]{":"}, 0, 6).get(0), strValueOf)) {
                    String notificationWordSent3 = env.notificationWordSent;
                    kotlin.jvm.internal.m.e(notificationWordSent3, "notificationWordSent");
                    int i13 = Integer.parseInt((String) oz.q.W0((CharSequence) oz.q.W0(notificationWordSent3, new String[]{":"}, 0, 6).get(1), new String[]{";"}, 0, 6).get(0));
                    String notificationWordSent4 = env.notificationWordSent;
                    kotlin.jvm.internal.m.e(notificationWordSent4, "notificationWordSent");
                    i12 = i13;
                    i11 = Integer.parseInt((String) oz.q.W0((CharSequence) oz.q.W0(notificationWordSent4, new String[]{":"}, 0, 6).get(1), new String[]{";"}, 0, 6).get(1));
                } else {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
            int i14 = wVar.f38359a;
            if (i14 == 0) {
                i12++;
            } else if (i14 == 1) {
                i11++;
            }
            env.notificationWordSent = strValueOf + ":" + i12 + ";" + i11;
            env.updateEntry("notificationWordSent");
        }
        if (this.f46370a) {
            se.k.v().c(aVar.i(), 1, aVar.l(), eVar.T);
            eVar.L.put(cwsId, 1);
        } else {
            se.k.v().c(aVar.i(), -1, aVar.l(), eVar.T);
            eVar.L.put(cwsId, -1);
        }
    }

    public /* synthetic */ f0(k7.c cVar, s sVar, x xVar, IOException iOException, boolean z11) {
        this.f46371b = cVar;
        this.f46372c = sVar;
        this.f46373d = xVar;
        this.f46374e = iOException;
        this.f46370a = z11;
    }
}

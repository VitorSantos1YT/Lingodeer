package tf;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.p0;
import com.facebook.CustomTabMainActivity;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import lf.j1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new b(6);
    public Map H;
    public LinkedHashMap K;
    public y L;
    public int M;
    public int N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e0[] f52228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f52230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hh.c f52231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o20.i f52232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52233f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f52234t;

    public final void a(String str, String str2, boolean z11) {
        Map map = this.H;
        if (map == null) {
            map = new HashMap();
        }
        if (this.H == null) {
            this.H = map;
        }
        if (map.containsKey(str) && z11) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        if (this.f52233f) {
            return true;
        }
        p0 p0VarE = e();
        if ((p0VarE != null ? p0VarE.checkCallingOrSelfPermission("android.permission.INTERNET") : -1) == 0) {
            this.f52233f = true;
            return true;
        }
        p0 p0VarE2 = e();
        String string = p0VarE2 != null ? p0VarE2.getString(R.string.com_facebook_internet_permission_error_title) : null;
        String string2 = p0VarE2 != null ? p0VarE2.getString(R.string.com_facebook_internet_permission_error_message) : null;
        t tVar = this.f52234t;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        c(new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    public final void c(v outcome) {
        w wVar;
        kotlin.jvm.internal.m.f(outcome, "outcome");
        u uVar = outcome.f52221a;
        e0 e0VarG = g();
        if (e0VarG != null) {
            wVar = this;
            wVar.j(e0VarG.e(), uVar.a(), outcome.f52224d, outcome.f52225e, e0VarG.f52165a);
        } else {
            wVar = this;
        }
        Map map = wVar.H;
        if (map != null) {
            outcome.f52227t = map;
        }
        LinkedHashMap linkedHashMap = wVar.K;
        if (linkedHashMap != null) {
            outcome.H = linkedHashMap;
        }
        wVar.f52228a = null;
        wVar.f52229b = -1;
        wVar.f52234t = null;
        wVar.H = null;
        wVar.M = 0;
        wVar.N = 0;
        hh.c cVar = wVar.f52231d;
        if (cVar != null) {
            x xVar = (x) cVar.f32212b;
            xVar.f52236b = null;
            int i11 = uVar == u.CANCEL ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            p0 activity = xVar.getActivity();
            if (!xVar.isAdded() || activity == null) {
                return;
            }
            activity.setResult(i11, intent);
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:8:0x0019, B:10:0x0023, B:14:0x004f, B:13:0x0036), top: B:23:0x0019 }] */
    public final void d(v outcome) {
        v vVar;
        kotlin.jvm.internal.m.f(outcome, "outcome");
        re.b bVar = outcome.f52222b;
        if (bVar != null) {
            Date date = re.b.N;
            if (ns.o.F()) {
                re.b bVarX = ns.o.x();
                if (bVarX != null) {
                    try {
                        if (kotlin.jvm.internal.m.a(bVarX.K, bVar.K)) {
                            vVar = new v(this.f52234t, u.SUCCESS, outcome.f52222b, outcome.f52223c, null, null);
                        } else {
                            t tVar = this.f52234t;
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("User logged in as different Facebook user.");
                            vVar = new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList), null);
                        }
                    } catch (Exception e8) {
                        t tVar2 = this.f52234t;
                        String message = e8.getMessage();
                        ArrayList arrayListL = w4.c.l("Caught exception");
                        if (message != null) {
                            arrayListL.add(message);
                        }
                        c(new v(tVar2, u.ERROR, null, TextUtils.join(": ", arrayListL), null));
                        return;
                    }
                } else {
                    t tVar3 = this.f52234t;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("User logged in as different Facebook user.");
                    vVar = new v(tVar3, u.ERROR, null, TextUtils.join(": ", arrayList2), null);
                }
                c(vVar);
                return;
            }
        }
        c(outcome);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p0 e() {
        x xVar = this.f52230c;
        if (xVar != null) {
            return xVar.getActivity();
        }
        return null;
    }

    public final e0 g() {
        e0[] e0VarArr;
        int i11 = this.f52229b;
        if (i11 < 0 || (e0VarArr = this.f52228a) == null) {
            return null;
        }
        return e0VarArr[i11];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x002a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    public final y i() {
        Context contextE;
        t tVar;
        String strB;
        String str;
        y yVar = this.L;
        if (yVar != null) {
            if (qf.a.b(yVar)) {
                str = null;
            } else {
                try {
                    str = yVar.f52241a;
                } catch (Throwable th2) {
                    qf.a.a(yVar, th2);
                    str = null;
                }
            }
            t tVar2 = this.f52234t;
            if (!kotlin.jvm.internal.m.a(str, tVar2 != null ? tVar2.f52217d : null)) {
                contextE = e();
                if (contextE == null) {
                    contextE = re.s.a();
                }
                tVar = this.f52234t;
                if (tVar != null || (strB = tVar.f52217d) == null) {
                    strB = re.s.b();
                }
                yVar = new y(contextE, strB);
                this.L = yVar;
            }
        } else {
            contextE = e();
            if (contextE == null) {
                contextE = re.s.a();
            }
            tVar = this.f52234t;
            if (tVar != null) {
                strB = re.s.b();
            } else {
                strB = re.s.b();
            }
            yVar = new y(contextE, strB);
            this.L = yVar;
        }
        return yVar;
    }

    public final void j(String str, String str2, String str3, String str4, Map map) {
        t tVar = this.f52234t;
        if (tVar == null) {
            i().a("fb_mobile_login_method_complete", str);
            return;
        }
        y yVarI = i();
        String str5 = tVar.f52218e;
        String str6 = tVar.O ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (qf.a.b(yVarI)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = y.f52240d;
            Bundle bundleB = c0.b(str5);
            if (str2 != null) {
                bundleB.putString("2_result", str2);
            }
            if (str3 != null) {
                bundleB.putString("5_error_message", str3);
            }
            if (str4 != null) {
                bundleB.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleB.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleB.putString("3_method", str);
            yVarI.f52242b.c(str6, bundleB);
        } catch (Throwable th2) {
            qf.a.a(yVarI, th2);
        }
    }

    public final void k(int i11, int i12, Intent intent) {
        this.M++;
        if (this.f52234t != null) {
            if (intent != null) {
                int i13 = CustomTabMainActivity.f7704c;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    l();
                    return;
                }
            }
            e0 e0VarG = g();
            if (e0VarG != null) {
                if ((e0VarG instanceof r) && intent == null && this.M < this.N) {
                    return;
                }
                e0VarG.j(i11, i12, intent);
            }
        }
    }

    public final void l() {
        w wVar;
        e0 e0VarG = g();
        if (e0VarG != null) {
            wVar = this;
            wVar.j(e0VarG.e(), "skipped", null, null, e0VarG.f52165a);
        } else {
            wVar = this;
        }
        e0[] e0VarArr = wVar.f52228a;
        while (e0VarArr != null) {
            int i11 = wVar.f52229b;
            if (i11 >= e0VarArr.length - 1) {
                break;
            }
            wVar.f52229b = i11 + 1;
            e0 e0VarG2 = g();
            if (e0VarG2 != null) {
                if (!(e0VarG2 instanceof l0) || b()) {
                    t tVar = wVar.f52234t;
                    if (tVar == null) {
                        continue;
                    } else {
                        int iM = e0VarG2.m(tVar);
                        wVar.M = 0;
                        if (iM > 0) {
                            y yVarI = i();
                            String str = tVar.f52218e;
                            String strE = e0VarG2.e();
                            String str2 = tVar.O ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!qf.a.b(yVarI)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = y.f52240d;
                                    Bundle bundleB = c0.b(str);
                                    bundleB.putString("3_method", strE);
                                    yVarI.f52242b.c(str2, bundleB);
                                } catch (Throwable th2) {
                                    qf.a.a(yVarI, th2);
                                }
                            }
                            wVar.N = iM;
                        } else {
                            y yVarI2 = i();
                            String str3 = tVar.f52218e;
                            String strE2 = e0VarG2.e();
                            String str4 = tVar.O ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!qf.a.b(yVarI2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = y.f52240d;
                                    Bundle bundleB2 = c0.b(str3);
                                    bundleB2.putString("3_method", strE2);
                                    yVarI2.f52242b.c(str4, bundleB2);
                                } catch (Throwable th3) {
                                    qf.a.a(yVarI2, th3);
                                }
                            }
                            a("not_tried", e0VarG2.e(), true);
                        }
                        if (iM > 0) {
                            return;
                        }
                    }
                } else {
                    a("no_internet_permission", "1", false);
                }
            }
        }
        t tVar2 = wVar.f52234t;
        if (tVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            c(new v(tVar2, u.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeParcelableArray(this.f52228a, i11);
        dest.writeInt(this.f52229b);
        dest.writeParcelable(this.f52234t, i11);
        j1.L(dest, this.H);
        j1.L(dest, this.K);
    }
}

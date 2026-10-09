package re;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import ay.k0;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import fr.p3;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.j1;
import lf.v0;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k0 f49141f = new k0(29);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f49142g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6.b f49143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o20.i f49144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f49145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f49146d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f49147e = new Date(0);

    public f(x6.b bVar, o20.i iVar) {
        this.f49143a = bVar;
        this.f49144b = iVar;
    }

    public final void a() {
        b bVar = this.f49145c;
        if (bVar == null) {
            return;
        }
        int i11 = 1;
        if (this.f49146d.compareAndSet(false, true)) {
            this.f49147e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            j4.i iVar = new j4.i();
            c cVar = new c(atomicBoolean, hashSet, hashSet2, hashSet3, 0);
            Bundle bundleE = b7.e0.e("fields", "permission,status");
            String str = y.f49225j;
            y yVarB = v.B(bVar, "me/permissions", cVar);
            yVarB.f49231d = bundleE;
            c0 c0Var = c0.GET;
            yVarB.k(c0Var);
            nf.a aVar = new nf.a(iVar, i11);
            String str2 = bVar.M;
            if (str2 == null) {
                str2 = "facebook";
            }
            e cVar2 = str2.equals("instagram") ? new p20.c(29) : new p3(29);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", cVar2.c());
            bundle.putString("client_id", bVar.H);
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            y yVarB2 = v.B(bVar, cVar2.f(), aVar);
            yVarB2.f49231d = bundle;
            yVarB2.k(c0Var);
            a0 a0Var = new a0(yVarB, yVarB2);
            d dVar = new d(iVar, bVar, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            ArrayList arrayList = a0Var.f49114d;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            v0.j(a0Var);
            new z(a0Var).executeOnExecutor(s.d(), new Void[0]);
        }
    }

    public final void b(b bVar, b bVar2) {
        Intent intent = new Intent(s.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", bVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", bVar2);
        this.f49143a.c(intent);
    }

    public final void c(b bVar, boolean z11) {
        boolean zEquals;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f49144b.f44522b;
        b bVar2 = this.f49145c;
        this.f49145c = bVar;
        this.f49146d.set(false);
        this.f49147e = new Date(0L);
        if (z11) {
            if (bVar != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", bVar.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                j1.c(s.a());
            }
        }
        if (bVar2 == null) {
            zEquals = bVar == null;
        } else {
            zEquals = bVar2.equals(bVar);
        }
        if (zEquals) {
            return;
        }
        b(bVar2, bVar);
        Context contextA = s.a();
        Date date = b.N;
        b bVarX = ns.o.x();
        AlarmManager alarmManager = (AlarmManager) contextA.getSystemService("alarm");
        if (ns.o.F()) {
            if ((bVarX != null ? bVarX.f49115a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextA, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, bVarX.f49115a.getTime(), PendingIntent.getBroadcast(contextA, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }
}

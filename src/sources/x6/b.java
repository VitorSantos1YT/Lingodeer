package x6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import l.g;
import qp.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f55806f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f55807g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f55809b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f55810c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f55811d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f55812e;

    public b(Context context) {
        this.f55808a = context;
        this.f55812e = new g(this, context.getMainLooper(), 4);
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f55806f) {
            try {
                if (f55807g == null) {
                    f55807g = new b(context.getApplicationContext());
                }
                bVar = f55807g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f55809b) {
            try {
                a aVar = new a(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.f55809b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f55809b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(aVar);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList arrayList2 = (ArrayList) this.f55810c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f55810c.put(action, arrayList2);
                    }
                    arrayList2.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(Intent intent) {
        int iMatch;
        synchronized (this.f55809b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f55808a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = (intent.getFlags() & 8) != 0;
                if (z11) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) this.f55810c.get(intent.getAction());
                if (arrayList != null) {
                    if (z11) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        a aVar = (a) arrayList.get(i11);
                        if (z11) {
                            Objects.toString(aVar.f55802a);
                        }
                        if (!aVar.f55804c && (iMatch = aVar.f55802a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z11) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(aVar);
                            aVar.f55804c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((a) arrayList2.get(i12)).f55804c = false;
                        }
                        this.f55811d.add(new r(8, intent, arrayList2));
                        if (!this.f55812e.hasMessages(1)) {
                            this.f55812e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f55809b) {
            try {
                ArrayList arrayList = (ArrayList) this.f55809b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a aVar = (a) arrayList.get(size);
                    aVar.f55805d = true;
                    for (int i11 = 0; i11 < aVar.f55802a.countActions(); i11++) {
                        String action = aVar.f55802a.getAction(i11);
                        ArrayList arrayList2 = (ArrayList) this.f55810c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                a aVar2 = (a) arrayList2.get(size2);
                                if (aVar2.f55803b == broadcastReceiver) {
                                    aVar2.f55805d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f55810c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

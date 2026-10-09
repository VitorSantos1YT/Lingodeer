package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import qy.l;
import qy.q;
import ry.s;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProcessDataManagerImpl implements ProcessDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f20916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f20918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f20919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20920f;

    public ProcessDataManagerImpl(Context appContext, UuidGenerator uuidGenerator) {
        m.f(appContext, "appContext");
        m.f(uuidGenerator, "uuidGenerator");
        this.f20915a = appContext;
        final int i11 = 0;
        this.f20916b = d.v(new fz.a(this) { // from class: com.google.firebase.sessions.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessDataManagerImpl f21046b;

            {
                this.f21046b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ((ProcessDetails) this.f21046b.f20919e.getValue()).f20923a;
                    default:
                        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.f20927a;
                        Context context = this.f21046b.f20915a;
                        processDetailsProvider.getClass();
                        return ProcessDetailsProvider.b(context);
                }
            }
        });
        this.f20917c = Process.myPid();
        this.f20918d = d.v(new av.d(uuidGenerator, 29));
        final int i12 = 1;
        this.f20919e = d.v(new fz.a(this) { // from class: com.google.firebase.sessions.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessDataManagerImpl f21046b;

            {
                this.f21046b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ((ProcessDetails) this.f21046b.f20919e.getValue()).f20923a;
                    default:
                        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.f20927a;
                        Context context = this.f21046b.f20915a;
                        processDetailsProvider.getClass();
                        return ProcessDetailsProvider.b(context);
                }
            }
        });
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final void a() {
        this.f20920f = true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final boolean b(Map processDataMap) {
        m.f(processDataMap, "processDataMap");
        if (!this.f20920f) {
            ProcessDetailsProvider.f20927a.getClass();
            ArrayList arrayListA = ProcessDetailsProvider.a(this.f20915a);
            ArrayList arrayList = new ArrayList();
            int size = arrayListA.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListA.get(i11);
                i11++;
                ProcessDetails processDetails = (ProcessDetails) obj;
                ProcessData processData = (ProcessData) processDataMap.get(processDetails.f20923a);
                l lVar = processData != null ? new l(processDetails, processData) : null;
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                l lVar2 = (l) obj2;
                ProcessDetails processDetails2 = (ProcessDetails) lVar2.f48495a;
                ProcessData processData2 = (ProcessData) lVar2.f48496b;
                String strC = c();
                String str = processDetails2.f20923a;
                int i13 = processDetails2.f20924b;
                if (m.a(strC, str)) {
                    if (i13 != processData2.f20912a || !m.a((String) this.f20918d.getValue(), processData2.f20913b)) {
                    }
                } else if (i13 != processData2.f20912a) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final String c() {
        return (String) this.f20916b.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final boolean d(Map processDataMap) {
        m.f(processDataMap, "processDataMap");
        ProcessData processData = (ProcessData) processDataMap.get(c());
        return (processData != null && processData.f20912a == this.f20917c && m.a(processData.f20913b, (String) this.f20918d.getValue())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final Map e() {
        return f(s.f50855a);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final Map f(Map map) {
        q qVar = this.f20918d;
        if (map == null) {
            return x.X(new l(c(), new ProcessData(Process.myPid(), (String) qVar.getValue())));
        }
        LinkedHashMap linkedHashMapK0 = x.k0(map);
        linkedHashMapK0.put(c(), new ProcessData(Process.myPid(), (String) qVar.getValue()));
        return x.h0(linkedHashMapK0);
    }
}

package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.media.metrics.LogSessionId;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import f7.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18365a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18369e;

    public /* synthetic */ i(Context context, boolean z11, a0 a0Var, g7.j jVar) {
        this.f18367c = context;
        this.f18366b = z11;
        this.f18368d = a0Var;
        this.f18369e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18365a) {
            case 0:
                SessionReportingCoordinator sessionReportingCoordinator = (SessionReportingCoordinator) this.f18367c;
                CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) this.f18368d;
                EventMetadata eventMetadata = (EventMetadata) this.f18369e;
                sessionReportingCoordinator.f18342b.d(event, eventMetadata.f18395a, this.f18366b);
                return;
            default:
                Context context = (Context) this.f18367c;
                boolean z11 = this.f18366b;
                a0 a0Var = (a0) this.f18368d;
                g7.j jVar = (g7.j) this.f18369e;
                g7.i iVarG = g7.i.g(context);
                if (iVarG == null) {
                    b7.a.B("MediaMetricsService unavailable.");
                    return;
                }
                if (z11) {
                    g7.f fVar = a0Var.V;
                    fVar.getClass();
                    fVar.f28809f.a(iVarG);
                }
                LogSessionId logSessionIdI = iVarG.i();
                synchronized (jVar) {
                    f3.i iVar = jVar.f28853b;
                    iVar.getClass();
                    iVar.h(logSessionIdI);
                }
                return;
        }
    }

    public /* synthetic */ i(SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsReport.Session.Event event, EventMetadata eventMetadata, boolean z11) {
        this.f18367c = sessionReportingCoordinator;
        this.f18368d = event;
        this.f18369e = eventMetadata;
        this.f18366b = z11;
    }
}

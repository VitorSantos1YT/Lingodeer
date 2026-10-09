package t9;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.m;
import se.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, int i11) {
        switch (i11) {
            case 1:
                m.f(context, "context");
                Object systemService = context.getSystemService((Class<Object>) n.i());
                m.e(systemService, "context.getSystemService…ementManager::class.java)");
                super(n.d(systemService));
                break;
            default:
                m.f(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                m.e(measurementManager, "get(context)");
                super(measurementManager);
                break;
        }
    }
}

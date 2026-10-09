package ve;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.e f54014a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(sensor, "sensor");
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(event, "event");
            com.google.android.datatransport.runtime.scheduling.jobscheduling.e eVar = this.f54014a;
            if (eVar != null) {
                float[] fArr = event.values;
                double d5 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d12 * d12) + (d11 * d11) + (d5 * d5)) > 2.3d) {
                    eVar.g();
                }
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}

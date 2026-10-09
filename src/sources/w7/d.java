package w7;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f54660a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f54661b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f54662c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f54663d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f54664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c[] f54665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54666g;

    public d(Display display, c... cVarArr) {
        this.f54664e = display;
        this.f54665f = cVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i11;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f54660a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f54664e.getRotation();
        float[] fArr3 = this.f54661b;
        if (rotation != 0) {
            int i12 = 129;
            if (rotation != 1) {
                i11 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i12 = 130;
                    i11 = 1;
                }
            } else {
                i11 = 129;
                i12 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i12, i11, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f54663d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f5 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        boolean z11 = this.f54666g;
        float[] fArr5 = this.f54662c;
        if (!z11) {
            bq.f.e(fArr5, fArr2);
            this.f54666g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i13 = 0; i13 < 2; i13++) {
            this.f54665f[i13].f(f5, fArr2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }
}

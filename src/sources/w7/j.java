package w7;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.yalantis.ucrop.view.CropImageView;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements GLSurfaceView.Renderer, c {
    public float H;
    public final /* synthetic */ SphericalGLSurfaceView M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f54691a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f54694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f54695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f54696f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f54697t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f54692b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f54693c = new float[16];
    public final float[] K = new float[16];
    public final float[] L = new float[16];

    public j(SphericalGLSurfaceView sphericalGLSurfaceView, i iVar) {
        this.M = sphericalGLSurfaceView;
        float[] fArr = new float[16];
        this.f54694d = fArr;
        float[] fArr2 = new float[16];
        this.f54695e = fArr2;
        float[] fArr3 = new float[16];
        this.f54696f = fArr3;
        this.f54691a = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.H = 3.1415927f;
    }

    @Override // w7.c
    public final synchronized void f(float f5, float[] fArr) {
        float[] fArr2 = this.f54694d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f11 = -f5;
        this.H = f11;
        Matrix.setRotateM(this.f54695e, 0, -this.f54697t, (float) Math.cos(f11), (float) Math.sin(this.H), CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objM;
        synchronized (this) {
            Matrix.multiplyMM(this.L, 0, this.f54694d, 0, this.f54696f, 0);
            Matrix.multiplyMM(this.K, 0, this.f54695e, 0, this.L, 0);
        }
        Matrix.multiplyMM(this.f54693c, 0, this.f54692b, 0, this.K, 0);
        i iVar = this.f54691a;
        float[] fArr2 = this.f54693c;
        GLES20.glClear(16384);
        try {
            b7.a.e();
        } catch (GlUtil$GlException e8) {
            b7.a.p("Failed to draw a frame", e8);
        }
        if (iVar.f54684a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.L;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                b7.a.e();
            } catch (GlUtil$GlException e10) {
                b7.a.p("Failed to draw a frame", e10);
            }
            if (iVar.f54685b.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.f54690t, 0);
            }
            long timestamp = iVar.L.getTimestamp();
            ar.f fVar = iVar.f54688e;
            synchronized (fVar) {
                objM = fVar.m(timestamp, false);
            }
            Long l9 = (Long) objM;
            if (l9 != null) {
                bq.f fVar2 = iVar.f54687d;
                float[] fArr3 = iVar.f54690t;
                float[] fArr4 = (float[]) ((ar.f) fVar2.f4946d).o(l9.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) fVar2.f4945c;
                    float f5 = fArr4[0];
                    float f11 = -fArr4[1];
                    float f12 = -fArr4[2];
                    float length = Matrix.length(f5, f11, f12);
                    if (length != CropImageView.DEFAULT_ASPECT_RATIO) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f5 / length, f11 / length, f12 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!fVar2.f4943a) {
                        bq.f.e((float[]) fVar2.f4944b, (float[]) fVar2.f4945c);
                        fVar2.f4943a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) fVar2.f4944b, 0, (float[]) fVar2.f4945c, 0);
                }
            }
            f fVar3 = (f) iVar.f54689f.o(timestamp);
            if (fVar3 != null) {
                g gVar = iVar.f54686c;
                gVar.getClass();
                if (g.b(fVar3)) {
                    gVar.f54675a = fVar3.f54670c;
                    gVar.f54676b = new ar.f(fVar3.f54668a.f54667a[0]);
                    if (!fVar3.f54671d) {
                        ar.f fVar4 = fVar3.f54669b.f54667a[0];
                        float[] fArr6 = (float[]) fVar4.f2848d;
                        int length2 = fArr6.length;
                        b7.a.m(fArr6);
                        b7.a.m((float[]) fVar4.f2849e);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.H, 0, fArr2, 0, iVar.f54690t, 0);
        g gVar2 = iVar.f54686c;
        int i11 = iVar.K;
        float[] fArr7 = iVar.H;
        ar.f fVar5 = gVar2.f54676b;
        if (fVar5 == null) {
            return;
        }
        int i12 = gVar2.f54675a;
        if (i12 == 1) {
            fArr = g.f54673j;
        } else {
            fArr = i12 == 2 ? g.f54674k : g.f54672i;
        }
        GLES20.glUniformMatrix3fv(gVar2.f54679e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(gVar2.f54678d, 1, false, fArr7, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i11);
        GLES20.glUniform1i(gVar2.f54682h, 0);
        try {
            b7.a.e();
        } catch (GlUtil$GlException unused) {
        }
        GLES20.glVertexAttribPointer(gVar2.f54680f, 3, 5126, false, 12, (Buffer) fVar5.f2848d);
        try {
            b7.a.e();
        } catch (GlUtil$GlException unused2) {
        }
        GLES20.glVertexAttribPointer(gVar2.f54681g, 2, 5126, false, 8, (Buffer) fVar5.f2849e);
        try {
            b7.a.e();
        } catch (GlUtil$GlException unused3) {
        }
        GLES20.glDrawArrays(fVar5.f2847c, 0, fVar5.f2846b);
        try {
            b7.a.e();
        } catch (GlUtil$GlException unused4) {
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        GLES20.glViewport(0, 0, i11, i12);
        float f5 = i11 / i12;
        Matrix.perspectiveM(this.f54692b, 0, f5 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f5))) * 2.0d) : 90.0f, f5, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.M;
        sphericalGLSurfaceView.f2151e.post(new pb.b(22, sphericalGLSurfaceView, this.f54691a.d()));
    }
}

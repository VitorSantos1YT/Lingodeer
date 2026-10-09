package v7;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements GLSurfaceView.Renderer {
    public static final String[] H = {gkbGsXmgaxRjJ.ykfwZbKfvexsaK, "u_tex", "v_tex"};
    public static final FloatBuffer K = b7.a.m(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoDecoderGLSurfaceView f53674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f53675b = new int[3];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f53676c = new int[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f53677d = new int[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f53678e = new int[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f53679f = new AtomicReference();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a.a f53680t;

    public r(VideoDecoderGLSurfaceView videoDecoderGLSurfaceView) {
        this.f53674a = videoDecoderGLSurfaceView;
        for (int i11 = 0; i11 < 3; i11++) {
            int[] iArr = this.f53677d;
            this.f53678e[i11] = -1;
            iArr[i11] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f53679f.getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        GLES20.glViewport(0, 0, i11, i12);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f53676c;
        try {
            a.a aVar = new a.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f53680t = aVar;
            GLES20.glVertexAttribPointer(aVar.z("in_pos"), 2, 5126, false, 0, (Buffer) K);
            iArr[0] = this.f53680t.z("in_tc_y");
            iArr[1] = this.f53680t.z("in_tc_u");
            iArr[2] = this.f53680t.z("in_tc_v");
            GLES20.glGetUniformLocation(this.f53680t.f5b, "mColorConversion");
            b7.a.e();
            int[] iArr2 = this.f53675b;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i11 = 0; i11 < 3; i11++) {
                    a.a aVar2 = this.f53680t;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(aVar2.f5b, H[i11]), i11);
                    GLES20.glActiveTexture(33984 + i11);
                    b7.a.b(3553, iArr2[i11]);
                }
                b7.a.e();
            } catch (GlUtil$GlException unused) {
            }
            b7.a.e();
        } catch (GlUtil$GlException unused2) {
        }
    }
}

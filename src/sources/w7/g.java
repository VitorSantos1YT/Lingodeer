package w7;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f54672i = {1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f54673j = {1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, -0.5f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f54674k = {0.5f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ar.f f54676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a f54677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54682h;

    public static boolean b(f fVar) {
        e eVar = fVar.f54668a;
        e eVar2 = fVar.f54669b;
        ar.f[] fVarArr = eVar.f54667a;
        if (fVarArr.length == 1 && fVarArr[0].f2846b == 0) {
            ar.f[] fVarArr2 = eVar2.f54667a;
            if (fVarArr2.length == 1 && fVarArr2[0].f2846b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            a.a aVar = new a.a("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f54677c = aVar;
            this.f54678d = GLES20.glGetUniformLocation(aVar.f5b, "uMvpMatrix");
            this.f54679e = GLES20.glGetUniformLocation(this.f54677c.f5b, "uTexMatrix");
            this.f54680f = this.f54677c.z("aPosition");
            this.f54681g = this.f54677c.z("aTexCoords");
            this.f54682h = GLES20.glGetUniformLocation(this.f54677c.f5b, "uTexture");
        } catch (GlUtil$GlException unused) {
        }
    }
}

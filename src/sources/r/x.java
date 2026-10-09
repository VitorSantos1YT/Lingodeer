package r;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f48704d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48705a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f48706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f48707c;

    public x(AbsSeekBar absSeekBar) {
        this.f48706b = absSeekBar;
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((qh.z) ((w00.d) this.f48707c).f54378a).getClass();
        if (keyListener instanceof x5.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new x5.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i11) {
        switch (this.f48705a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f48706b;
                m4 m4VarK = m4.k(absSeekBar.getContext(), attributeSet, f48704d, i11);
                Drawable drawableH = m4VarK.h(0);
                if (drawableH != null) {
                    if (drawableH instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableH;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i12 = 0; i12 < numberOfFrames; i12++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i12), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i12));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableH = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableH);
                }
                Drawable drawableH2 = m4VarK.h(1);
                if (drawableH2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableH2, false));
                }
                m4VarK.l();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f48706b).getContext().obtainStyledAttributes(attributeSet, k.a.f37408j, i11, 0);
                try {
                    boolean z11 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z11 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z11);
                    return;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public x5.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        w00.d dVar = (w00.d) this.f48707c;
        if (inputConnection == null) {
            dVar.getClass();
            inputConnection = null;
        } else {
            qh.z zVar = (qh.z) dVar.f54378a;
            zVar.getClass();
            if (!(inputConnection instanceof x5.b)) {
                inputConnection = new x5.b((EditText) zVar.f47796b, inputConnection, editorInfo);
            }
        }
        return (x5.b) inputConnection;
    }

    public void d(boolean z11) {
        x5.i iVar = (x5.i) ((qh.z) ((w00.d) this.f48707c).f54378a).f47797c;
        if (iVar.f55800c != z11) {
            if (iVar.f55799b != null) {
                v5.j jVarA = v5.j.a();
                x5.h hVar = iVar.f55799b;
                jVarA.getClass();
                ns.o.l(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f53526a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f53527b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th2;
                }
            }
            iVar.f55800c = z11;
            if (z11) {
                x5.i.a(iVar.f55798a, v5.j.a().c());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z11) {
        if (drawable instanceof s4.a) {
            ((s4.b) ((s4.a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    int id2 = layerDrawable.getId(i11);
                    drawableArr[i11] = e(layerDrawable.getDrawable(i11), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i12 = 0; i12 < numberOfLayers; i12++) {
                    layerDrawable2.setId(i12, layerDrawable.getId(i12));
                    layerDrawable2.setLayerGravity(i12, layerDrawable.getLayerGravity(i12));
                    layerDrawable2.setLayerWidth(i12, layerDrawable.getLayerWidth(i12));
                    layerDrawable2.setLayerHeight(i12, layerDrawable.getLayerHeight(i12));
                    layerDrawable2.setLayerInsetLeft(i12, layerDrawable.getLayerInsetLeft(i12));
                    layerDrawable2.setLayerInsetRight(i12, layerDrawable.getLayerInsetRight(i12));
                    layerDrawable2.setLayerInsetTop(i12, layerDrawable.getLayerInsetTop(i12));
                    layerDrawable2.setLayerInsetBottom(i12, layerDrawable.getLayerInsetBottom(i12));
                    layerDrawable2.setLayerInsetStart(i12, layerDrawable.getLayerInsetStart(i12));
                    layerDrawable2.setLayerInsetEnd(i12, layerDrawable.getLayerInsetEnd(i12));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f48707c) == null) {
                    this.f48707c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z11 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public x(EditText editText) {
        this.f48706b = editText;
        this.f48707c = new w00.d(editText);
    }
}

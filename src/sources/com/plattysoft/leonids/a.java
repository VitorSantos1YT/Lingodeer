package com.plattysoft.leonids;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.p0;
import com.google.android.material.datepicker.d;
import com.lingodeer.R;
import fw.b;
import fw.c;
import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f22395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f22397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ParticleField f22398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f22399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f22401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f22403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f22404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f22405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f22406l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f22407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22409p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22410q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22411r;

    public a(p0 p0Var) {
        Drawable drawable = p0Var.getResources().getDrawable(R.drawable.ic_img_star_boom);
        this.f22400f = new ArrayList();
        this.f22397c = new Random();
        ViewGroup viewGroup = (ViewGroup) p0Var.findViewById(android.R.id.content);
        this.f22395a = viewGroup;
        this.f22404j = new ArrayList();
        this.f22405k = new ArrayList();
        this.f22396b = 40;
        this.f22399e = new ArrayList();
        this.f22401g = 300L;
        int[] iArr = new int[2];
        this.f22407n = iArr;
        viewGroup.getLocationInWindow(iArr);
        this.m = p0Var.getResources().getDisplayMetrics().xdpi / 160.0f;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            for (int i11 = 0; i11 < this.f22396b; i11++) {
                ArrayList arrayList = this.f22399e;
                b bVar = new b();
                bVar.f28206a = bitmap;
                arrayList.add(bVar);
            }
            return;
        }
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            for (int i12 = 0; i12 < this.f22396b; i12++) {
                ArrayList arrayList2 = this.f22399e;
                fw.a aVar = new fw.a();
                aVar.f28204u = animationDrawable;
                aVar.f28206a = ((BitmapDrawable) animationDrawable.getFrame(0)).getBitmap();
                aVar.f28205v = 0;
                for (int i13 = 0; i13 < aVar.f28204u.getNumberOfFrames(); i13++) {
                    aVar.f28205v = aVar.f28204u.getDuration(i13) + aVar.f28205v;
                }
                arrayList2.add(aVar);
            }
        }
    }

    public static boolean b(int i11) {
        return (17 & i11) == i11;
    }

    public final void a(long j11) {
        Random random;
        int i11 = 0;
        b bVar = (b) this.f22399e.remove(0);
        bVar.f28209d = 1.0f;
        bVar.f28210e = 255;
        while (true) {
            ArrayList arrayList = this.f22405k;
            int size = arrayList.size();
            random = this.f22397c;
            if (i11 >= size) {
                break;
            }
            ((gw.b) arrayList.get(i11)).a(bVar, random);
            i11++;
        }
        int iNextInt = this.f22408o;
        int i12 = this.f22409p;
        if (iNextInt != i12) {
            iNextInt += random.nextInt(i12 - iNextInt);
        }
        int iNextInt2 = this.f22410q;
        int i13 = this.f22411r;
        if (iNextInt2 != i13) {
            iNextInt2 += random.nextInt(i13 - iNextInt2);
        }
        bVar.f28222r = bVar.f28206a.getWidth() / 2;
        int height = bVar.f28206a.getHeight() / 2;
        bVar.f28223s = height;
        float f5 = iNextInt - bVar.f28222r;
        bVar.m = f5;
        float f11 = iNextInt2 - height;
        bVar.f28218n = f11;
        bVar.f28207b = f5;
        bVar.f28208c = f11;
        bVar.f28220p = this.f22401g;
        bVar.f28221q = j11;
        bVar.f28224t = this.f22404j;
        this.f22400f.add(bVar);
        this.f22402h++;
    }

    public final void c(View view) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        boolean zB = b(3);
        int[] iArr2 = this.f22407n;
        if (zB) {
            int i11 = iArr[0] - iArr2[0];
            this.f22408o = i11;
            this.f22409p = i11;
        } else if (b(5)) {
            int width = (view.getWidth() + iArr[0]) - iArr2[0];
            this.f22408o = width;
            this.f22409p = width;
        } else if (b(1)) {
            int iC = d.c(view, 2, iArr[0]) - iArr2[0];
            this.f22408o = iC;
            this.f22409p = iC;
        } else {
            int i12 = iArr[0];
            this.f22408o = i12 - iArr2[0];
            this.f22409p = (view.getWidth() + i12) - iArr2[0];
        }
        if (b(48)) {
            int i13 = iArr[1] - iArr2[1];
            this.f22410q = i13;
            this.f22411r = i13;
        } else if (b(80)) {
            int height = (view.getHeight() + iArr[1]) - iArr2[1];
            this.f22410q = height;
            this.f22411r = height;
        } else if (b(16)) {
            int height2 = ((view.getHeight() / 2) + iArr[1]) - iArr2[1];
            this.f22410q = height2;
            this.f22411r = height2;
        } else {
            int i14 = iArr[1];
            this.f22410q = i14 - iArr2[1];
            this.f22411r = (view.getHeight() + i14) - iArr2[1];
        }
        this.f22402h = 0;
        long j11 = this.f22401g;
        this.f22403i = j11;
        for (int i15 = 0; i15 < 40 && i15 < this.f22396b; i15++) {
            a(0L);
        }
        ViewGroup viewGroup = this.f22395a;
        ParticleField particleField = new ParticleField(viewGroup.getContext());
        this.f22398d = particleField;
        viewGroup.addView(particleField);
        this.f22398d.f22394a = this.f22400f;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) j11);
        this.f22406l = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(j11);
        this.f22406l.addUpdateListener(new c(this));
        this.f22406l.addListener(new fw.d(this, 0));
        this.f22406l.setInterpolator(linearInterpolator);
        this.f22406l.start();
    }
}

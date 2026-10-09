package g1;

import a0.b2;
import android.graphics.Bitmap;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidComposeView;
import b0.a2;
import b0.i2;
import bq.z;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.Preconditions;
import com.google.common.io.ByteStreams;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import e6.q0;
import fu.h0;
import g2.x;
import gb.r;
import hh.s;
import hj.h6;
import hj.i6;
import hj.x3;
import ie.o;
import java.io.IOException;
import java.util.ArrayList;
import lw.c1;
import mw.g1;
import mw.n5;
import nw.m;
import o20.w;
import qp.o2;
import rz.b0;
import rz.e0;
import y2.i0;
import y2.k0;
import y2.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f28530c = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28531d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f28532e;

    public k(fz.a aVar, boolean z11) {
        this.f28528a = z11;
        this.f28529b = aVar;
    }

    public k a(k kVar, boolean z11) {
        p20.c.a(((k) this.f28530c) == null);
        p20.c.a(((k) this.f28531d) == null);
        if (kVar == null) {
            this.f28531d = this;
            this.f28530c = this;
            kVar = this;
        } else {
            this.f28530c = kVar;
            k kVar2 = (k) kVar.f28531d;
            this.f28531d = kVar2;
            if (kVar2 != null) {
                kVar2.f28530c = this;
            }
            k kVar3 = (k) this.f28530c;
            if (kVar3 != null) {
                kVar3.f28531d = kVar2 != null ? (k) kVar2.f28530c : null;
            }
        }
        return z11 ? this : kVar;
    }

    public void b() {
        x3 x3Var = (x3) this.f28529b;
        x3Var.f33572e.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        x3Var.f33578k.m.setVisibility(8);
        x3Var.f33578k.f32732j.setVisibility(8);
        x3Var.f33578k.f32730h.setImageResource(0);
        x3Var.f33578k.f32731i.setImageResource(0);
        Bitmap bitmap = (Bitmap) this.f28532e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f28532e = null;
    }

    @Override // mw.g1
    public void close() {
        this.f28528a = true;
        Preconditions.p("Lack of request message. GET request is only supported for unary requests", ((byte[]) this.f28531d) != null);
        ((m) ((mw.c) this.f28532e)).Q.n((c1) this.f28529b, (byte[]) this.f28531d);
        this.f28531d = null;
        this.f28529b = null;
    }

    @Override // mw.g1
    public void e(qw.a aVar) {
        n5 n5Var = (n5) this.f28530c;
        Preconditions.p("writePayload should not be called multiple times", ((byte[]) this.f28531d) == null);
        try {
            this.f28531d = ByteStreams.c(aVar);
            lw.j[] jVarArr = n5Var.f42589a;
            lw.j[] jVarArr2 = n5Var.f42589a;
            for (lw.j jVar : jVarArr) {
                jVar.i(0);
            }
            byte[] bArr = (byte[]) this.f28531d;
            long length = bArr.length;
            long length2 = bArr.length;
            for (lw.j jVar2 : n5Var.f42589a) {
                jVar2.j(length, 0, length2);
            }
            long length3 = ((byte[]) this.f28531d).length;
            for (lw.j jVar3 : jVarArr2) {
                jVar3.k(length3);
            }
            long length4 = ((byte[]) this.f28531d).length;
            for (lw.j jVar4 : jVarArr2) {
                jVar4.l(length4);
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public void f(k0 k0Var, float f5, long j11) {
        i2.b bVar = k0Var.f56937a;
        float fFloatValue = ((Number) ((b0.d) this.f28530c).d()).floatValue();
        if (fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO) {
            long jC = x.c(j11, fFloatValue);
            if (!this.f28528a) {
                i2.d.j(k0Var, jC, f5, 0L, null, 0, 124);
                return;
            }
            float fD = f2.e.d(bVar.d());
            float fB = f2.e.b(bVar.d());
            xq.c cVar = bVar.f34121b;
            long jH = cVar.H();
            cVar.x().e();
            try {
                ((b2) cVar.f56174b).e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fD, fB, 1);
                i2.d.j(k0Var, jC, f5, 0L, null, 0, 124);
            } finally {
                com.google.android.material.datepicker.d.C(cVar, jH);
            }
        }
    }

    public void g(h0.h hVar, b0 b0Var) {
        float f5;
        ArrayList arrayList = (ArrayList) this.f28531d;
        if (hVar instanceof h0.f) {
            arrayList.add(hVar);
        } else if (hVar instanceof h0.g) {
            arrayList.remove(((h0.g) hVar).f29905a);
        } else if (hVar instanceof h0.d) {
            arrayList.add(hVar);
        } else if (hVar instanceof h0.e) {
            arrayList.remove(((h0.e) hVar).f29904a);
        } else if (hVar instanceof h0.b) {
            arrayList.add(hVar);
        } else if (hVar instanceof h0.c) {
            arrayList.remove(((h0.c) hVar).f29903a);
        } else if (!(hVar instanceof h0.a)) {
            return;
        } else {
            arrayList.remove(((h0.a) hVar).f29902a);
        }
        h0.h hVar2 = (h0.h) ry.m.A0(arrayList);
        if (kotlin.jvm.internal.m.a((h0.h) this.f28532e, hVar2)) {
            return;
        }
        vy.d dVar = null;
        if (hVar2 != null) {
            e eVar = (e) ((fz.a) this.f28529b).invoke();
            boolean z11 = hVar2 instanceof h0.f;
            if (z11) {
                f5 = eVar.f28521c;
            } else if (hVar2 instanceof h0.d) {
                f5 = eVar.f28520b;
            } else {
                f5 = hVar2 instanceof h0.b ? eVar.f28519a : CropImageView.DEFAULT_ASPECT_RATIO;
            }
            i2 i2Var = h.f28524a;
            if (!z11 && ((hVar2 instanceof h0.d) || (hVar2 instanceof h0.b))) {
                i2Var = new i2(45, b0.b0.f3441d, 2);
            }
            e0.B(b0Var, null, null, new a2(this, f5, i2Var, (vy.d) null), 3);
        } else {
            h0.h hVar3 = (h0.h) this.f28532e;
            i2 i2Var2 = h.f28524a;
            if (!(hVar3 instanceof h0.f) && !(hVar3 instanceof h0.d) && (hVar3 instanceof h0.b)) {
                i2Var2 = new i2(150, b0.b0.f3441d, 2);
            }
            e0.B(b0Var, null, null, new q0(25, this, i2Var2, dVar), 3);
        }
        this.f28532e = hVar2;
    }

    public void h(hi.a aVar, final int i11, final int i12, final String mode) {
        x3 x3Var = (x3) this.f28529b;
        kotlin.jvm.internal.m.f(mode, "mode");
        if (this.f28528a) {
            x3Var.f33578k.f32733k.setBackgroundResource(R.drawable.share_content_toolbar_bg);
        } else {
            x3Var.f33578k.f32733k.setBackgroundResource(R.drawable.share_content_toolbar_bg_wrong);
        }
        h6 h6Var = x3Var.f33576i;
        i6 i6Var = x3Var.f33578k;
        final int i13 = 0;
        z.b(h6Var.f32665d, new fz.c(this) { // from class: vq.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1.k f54101b;

            {
                this.f54101b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar = this.f54101b;
                        ((x3) kVar.f28529b).f33576i.f32668g.setAlpha(0.5f);
                        x3 x3Var2 = (x3) kVar.f28529b;
                        x3Var2.f33569b.setAlpha(0.5f);
                        kVar.f28532e = r.S((l.m) kVar.f28530c);
                        x3Var2.f33576i.f32668g.setAlpha(1.0f);
                        x3Var2.f33569b.setAlpha(1.0f);
                        i6 i6Var2 = x3Var2.f33578k;
                        i6Var2.f32730h.setImageBitmap((Bitmap) kVar.f28532e);
                        i6Var2.m.setVisibility(0);
                        i6Var2.f32732j.setVisibility(0);
                        i6Var2.f32728f.getText().clear();
                        x3Var2.f33572e.setAlpha(1.0f);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar2 = this.f54101b;
                        ((x3) kVar2.f28529b).f33578k.f32734l.setVisibility(8);
                        ((x3) kVar2.f28529b).f33578k.f32731i.setVisibility(8);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar3 = this.f54101b;
                        ((x3) kVar3.f28529b).f33578k.f32734l.setVisibility(0);
                        x3 x3Var3 = (x3) kVar3.f28529b;
                        x3Var3.f33578k.f32731i.setVisibility(0);
                        i6 i6Var3 = x3Var3.f33578k;
                        ViewGroup.LayoutParams layoutParams = i6Var3.f32731i.getLayoutParams();
                        layoutParams.width = (b7.e0.f(LingoSkillApplication.f21665b).widthPixels * 5) / 7;
                        layoutParams.height = (b7.e0.f(LingoSkillApplication.f21665b).heightPixels * 5) / 7;
                        ImageView imageView = i6Var3.f32731i;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageBitmap((Bitmap) kVar3.f28532e);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        z.b(i6Var.f32729g, new fz.c() { // from class: vq.i
            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f54102a.b();
                String str = mode;
                if (str.length() > 0) {
                    xt.b.d().c("jxz_main_click_in_lesson_bugrep", new k(str, i11, i12, 0));
                }
                return qy.b0.f48488a;
            }
        });
        i6Var.f32725c.setOnClickListener(new View.OnClickListener(this) { // from class: vq.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1.k f54107b;

            {
                this.f54107b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        x3 x3Var2 = (x3) this.f54107b.f28529b;
                        i6 i6Var2 = x3Var2.f33578k;
                        i6 i6Var3 = x3Var2.f33578k;
                        if (i6Var2.f32725c.isChecked()) {
                            i6Var3.f32727e.setChecked(false);
                        } else if (!i6Var3.f32725c.isChecked() && !i6Var3.f32727e.isChecked()) {
                            i6Var3.f32725c.setChecked(true);
                        }
                        i6Var3.f32724b.setEnabled(true);
                        break;
                    default:
                        x3 x3Var3 = (x3) this.f54107b.f28529b;
                        i6 i6Var4 = x3Var3.f33578k;
                        i6 i6Var5 = x3Var3.f33578k;
                        if (i6Var4.f32727e.isChecked()) {
                            i6Var5.f32725c.setChecked(false);
                        } else if (!i6Var5.f32725c.isChecked() && !i6Var5.f32727e.isChecked()) {
                            i6Var5.f32727e.setChecked(true);
                        }
                        MaterialButton materialButton = i6Var5.f32724b;
                        Editable text = i6Var5.f32728f.getText();
                        materialButton.setEnabled(!(text == null || text.length() == 0));
                        break;
                }
            }
        });
        final int i14 = 1;
        i6Var.f32727e.setOnClickListener(new View.OnClickListener(this) { // from class: vq.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1.k f54107b;

            {
                this.f54107b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        x3 x3Var2 = (x3) this.f54107b.f28529b;
                        i6 i6Var2 = x3Var2.f33578k;
                        i6 i6Var3 = x3Var2.f33578k;
                        if (i6Var2.f32725c.isChecked()) {
                            i6Var3.f32727e.setChecked(false);
                        } else if (!i6Var3.f32725c.isChecked() && !i6Var3.f32727e.isChecked()) {
                            i6Var3.f32725c.setChecked(true);
                        }
                        i6Var3.f32724b.setEnabled(true);
                        break;
                    default:
                        x3 x3Var3 = (x3) this.f54107b.f28529b;
                        i6 i6Var4 = x3Var3.f33578k;
                        i6 i6Var5 = x3Var3.f33578k;
                        if (i6Var4.f32727e.isChecked()) {
                            i6Var5.f32725c.setChecked(false);
                        } else if (!i6Var5.f32725c.isChecked() && !i6Var5.f32727e.isChecked()) {
                            i6Var5.f32727e.setChecked(true);
                        }
                        MaterialButton materialButton = i6Var5.f32724b;
                        Editable text = i6Var5.f32728f.getText();
                        materialButton.setEnabled(!(text == null || text.length() == 0));
                        break;
                }
            }
        });
        i6Var.f32728f.addTextChangedListener(new s(this, 9));
        z.b(i6Var.f32724b, new h0(this, aVar, i11, i12, mode));
        final int i15 = 1;
        z.b(i6Var.f32734l, new fz.c(this) { // from class: vq.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1.k f54101b;

            {
                this.f54101b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar = this.f54101b;
                        ((x3) kVar.f28529b).f33576i.f32668g.setAlpha(0.5f);
                        x3 x3Var2 = (x3) kVar.f28529b;
                        x3Var2.f33569b.setAlpha(0.5f);
                        kVar.f28532e = r.S((l.m) kVar.f28530c);
                        x3Var2.f33576i.f32668g.setAlpha(1.0f);
                        x3Var2.f33569b.setAlpha(1.0f);
                        i6 i6Var2 = x3Var2.f33578k;
                        i6Var2.f32730h.setImageBitmap((Bitmap) kVar.f28532e);
                        i6Var2.m.setVisibility(0);
                        i6Var2.f32732j.setVisibility(0);
                        i6Var2.f32728f.getText().clear();
                        x3Var2.f33572e.setAlpha(1.0f);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar2 = this.f54101b;
                        ((x3) kVar2.f28529b).f33578k.f32734l.setVisibility(8);
                        ((x3) kVar2.f28529b).f33578k.f32731i.setVisibility(8);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar3 = this.f54101b;
                        ((x3) kVar3.f28529b).f33578k.f32734l.setVisibility(0);
                        x3 x3Var3 = (x3) kVar3.f28529b;
                        x3Var3.f33578k.f32731i.setVisibility(0);
                        i6 i6Var3 = x3Var3.f33578k;
                        ViewGroup.LayoutParams layoutParams = i6Var3.f32731i.getLayoutParams();
                        layoutParams.width = (b7.e0.f(LingoSkillApplication.f21665b).widthPixels * 5) / 7;
                        layoutParams.height = (b7.e0.f(LingoSkillApplication.f21665b).heightPixels * 5) / 7;
                        ImageView imageView = i6Var3.f32731i;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageBitmap((Bitmap) kVar3.f28532e);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        final int i16 = 2;
        z.b(i6Var.f32730h, new fz.c(this) { // from class: vq.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1.k f54101b;

            {
                this.f54101b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar = this.f54101b;
                        ((x3) kVar.f28529b).f33576i.f32668g.setAlpha(0.5f);
                        x3 x3Var2 = (x3) kVar.f28529b;
                        x3Var2.f33569b.setAlpha(0.5f);
                        kVar.f28532e = r.S((l.m) kVar.f28530c);
                        x3Var2.f33576i.f32668g.setAlpha(1.0f);
                        x3Var2.f33569b.setAlpha(1.0f);
                        i6 i6Var2 = x3Var2.f33578k;
                        i6Var2.f32730h.setImageBitmap((Bitmap) kVar.f28532e);
                        i6Var2.m.setVisibility(0);
                        i6Var2.f32732j.setVisibility(0);
                        i6Var2.f32728f.getText().clear();
                        x3Var2.f33572e.setAlpha(1.0f);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar2 = this.f54101b;
                        ((x3) kVar2.f28529b).f33578k.f32734l.setVisibility(8);
                        ((x3) kVar2.f28529b).f33578k.f32731i.setVisibility(8);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        g1.k kVar3 = this.f54101b;
                        ((x3) kVar3.f28529b).f33578k.f32734l.setVisibility(0);
                        x3 x3Var3 = (x3) kVar3.f28529b;
                        x3Var3.f33578k.f32731i.setVisibility(0);
                        i6 i6Var3 = x3Var3.f33578k;
                        ViewGroup.LayoutParams layoutParams = i6Var3.f32731i.getLayoutParams();
                        layoutParams.width = (b7.e0.f(LingoSkillApplication.f21665b).widthPixels * 5) / 7;
                        layoutParams.height = (b7.e0.f(LingoSkillApplication.f21665b).heightPixels * 5) / 7;
                        ImageView imageView = i6Var3.f32731i;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageBitmap((Bitmap) kVar3.f28532e);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int i(o2 o2Var, AndroidComposeView androidComposeView, boolean z11) {
        int i11;
        Object[] objArr;
        int i12;
        int i13;
        s2.d dVar = (s2.d) this.f28530c;
        t tVar = (t) this.f28532e;
        if (this.f28528a) {
            return 0;
        }
        try {
            this.f28528a = true;
            o oVarG = ((w) this.f28531d).g(o2Var, androidComposeView);
            y.r rVar = (y.r) oVarG.f34406c;
            int iJ = rVar.j();
            while (true) {
                if (i11 >= iJ) {
                    objArr = true;
                    break;
                }
                s2.t tVar2 = (s2.t) rVar.k(i11);
                i11 = (tVar2.f51346d || tVar2.f51350h) ? 0 : i11 + 1;
                objArr = false;
                break;
            }
            int iJ2 = rVar.j();
            for (int i14 = 0; i14 < iJ2; i14++) {
                s2.t tVar3 = (s2.t) rVar.k(i14);
                if (objArr != false || s2.s.a(tVar3)) {
                    ((i0) this.f28529b).B(tVar3.f51345c, (t) this.f28532e, tVar3.f51351i, true);
                    if (!tVar.f57003a.h()) {
                        dVar.a(tVar3.f51343a, tVar, s2.s.a(tVar3));
                        tVar.clear();
                    }
                }
            }
            boolean zB = dVar.b(oVarG, z11);
            if (oVarG.f34405b) {
                i12 = 0;
                break;
            }
            int iJ3 = rVar.j();
            int i15 = 0;
            while (true) {
                if (i15 >= iJ3) {
                    i12 = 0;
                    break;
                }
                s2.t tVar4 = (s2.t) rVar.k(i15);
                if (!f2.b.c(s2.s.g(tVar4, true), 0L) && tVar4.b()) {
                    i12 = 1;
                    break;
                }
                i15++;
            }
            int iJ4 = rVar.j();
            for (int i16 = 0; i16 < iJ4; i16++) {
                if (((s2.t) rVar.k(i16)).b()) {
                    i13 = 1;
                    return (zB ? 1 : 0) | (i12 << 1) | (i13 << 2);
                }
            }
            i13 = 0;
            return (zB ? 1 : 0) | (i12 << 1) | (i13 << 2);
        } finally {
            this.f28528a = false;
        }
    }

    @Override // mw.g1
    public boolean isClosed() {
        return this.f28528a;
    }

    public k j(k kVar) {
        p20.c.a(((k) this.f28530c) != null);
        p20.c.a(((k) this.f28531d) != null);
        if (kVar == this && (kVar = (k) this.f28530c) == this) {
            kVar = null;
        }
        k kVar2 = (k) this.f28530c;
        if (kVar2 != null) {
            kVar2.f28531d = (k) this.f28531d;
        }
        k kVar3 = (k) this.f28531d;
        if (kVar3 != null) {
            kVar3.f28530c = kVar2;
        }
        this.f28531d = null;
        this.f28530c = null;
        return kVar;
    }

    @Override // mw.g1
    public void flush() {
    }

    @Override // mw.g1
    public g1 c(lw.l lVar) {
        return this;
    }

    @Override // mw.g1
    public void d(int i11) {
    }
}

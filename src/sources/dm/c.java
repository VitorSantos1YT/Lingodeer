package dm;

import a0.o0;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import av.l;
import b0.d0;
import b0.o2;
import b0.s;
import b0.t;
import b7.f0;
import b7.v;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.flexbox.FlexboxLayout;
import com.google.common.collect.ImmutableList;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.CharGroup;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.env.FontSizeStyleKt;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import java.lang.ref.ReferenceQueue;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.Inflater;
import km.j2;
import kotlin.jvm.internal.m;
import kp.e;
import kr.b0;
import kr.i;
import lp.f;
import mw.j5;
import mw.n3;
import om.j;
import qp.d5;
import qx.p;
import qy.q;
import rz.g1;
import td.g;
import u8.k;
import uz.i1;
import vd.o;
import vd.w;
import y.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements o2, k, tx.c, l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f23488f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f23492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f23493e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f23489a = i11;
        this.f23490b = obj;
        this.f23491c = obj2;
        this.f23492d = obj3;
        this.f23493e = obj4;
    }

    @Override // av.l
    public void a() {
        Object value;
        i iVar;
        Object value2;
        i iVar2;
        i1 i1Var = ((b0) this.f23492d).K;
        i iVar3 = (i) this.f23490b;
        if (iVar3.f38494d + 1 < ((List) this.f23491c).size()) {
            do {
                value = i1Var.getValue();
                iVar = (i) value;
            } while (!i1Var.j(value, iVar != null ? i.a(iVar, false, CropImageView.DEFAULT_ASPECT_RATIO, iVar3.f38494d + 1, 7) : null));
        } else {
            List list = (List) this.f23493e;
            do {
                value2 = i1Var.getValue();
                iVar2 = (i) value2;
            } while (!i1Var.j(value2, iVar2 != null ? i.a(iVar2, false, CropImageView.DEFAULT_ASPECT_RATIO, list.size(), 5) : null));
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f23489a) {
            case 5:
                Long it = (Long) obj;
                NestedScrollView nestedScrollView = (NestedScrollView) this.f23493e;
                RecyclerView recyclerView = (RecyclerView) this.f23492d;
                List list = (List) this.f23491c;
                m.f(it, "it");
                j2 j2Var = (j2) this.f23490b;
                if (j2Var.X.get()) {
                    return;
                }
                int i11 = j2Var.Q + 1;
                j2Var.Q = i11;
                if (i11 < list.size()) {
                    j2Var.z(recyclerView, list, nestedScrollView);
                    return;
                } else {
                    j2Var.Q = 0;
                    j2Var.z(recyclerView, list, nestedScrollView);
                    return;
                }
            case 6:
                ArrayList arrayList = (ArrayList) this.f23493e;
                Model_Sentence_050 model_Sentence_050 = (Model_Sentence_050) obj;
                FlexboxLayout flexboxLayout = (FlexboxLayout) this.f23491c;
                AbsDialogModelAdapter absDialogModelAdapter = (AbsDialogModelAdapter) this.f23490b;
                List<Word> optionList = model_Sentence_050.getOptionList();
                m.e(optionList, "getOptionList(...)");
                Collections.shuffle(optionList);
                for (Word word : model_Sentence_050.getOptionList()) {
                    View viewInflate = LayoutInflater.from(((BaseQuickAdapter) absDialogModelAdapter).mContext).inflate(R.layout.item_dialog_word_card_framlayout, (ViewGroup) flexboxLayout, false);
                    m.d(viewInflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    CardView cardView = (CardView) viewInflate;
                    TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
                    TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
                    Context context = ((BaseQuickAdapter) absDialogModelAdapter).mContext;
                    m.e(context, "access$getMContext$p$s-1838890688(...)");
                    cardView.setCardBackgroundColor(context.getColor(R.color.white));
                    cardView.setCardElevation(h.l(2.0f));
                    cardView.setTag(word);
                    m.c(word);
                    AbsDialogModelAdapter.g(absDialogModelAdapter, cardView, word);
                    flexboxLayout.addView(cardView);
                    z.b(cardView, new e(arrayList, word, cardView, absDialogModelAdapter, textView2, textView, flexboxLayout, 0));
                }
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) ((View) this.f23492d).findViewById(R.id.flex_sentence);
                int childCount = flexboxLayout2.getChildCount();
                for (int i12 = 1; i12 < childCount; i12++) {
                    View childAt = flexboxLayout2.getChildAt(i12);
                    TextView textView3 = (TextView) childAt.findViewById(R.id.tv_middle);
                    Object tag = childAt.getTag();
                    m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    if (((Word) tag).getWordType() != 1) {
                        textView3.setVisibility(4);
                        arrayList.add(childAt);
                        childAt.setTag(R.id.tag_is_invisiable, Boolean.TRUE);
                    }
                }
                AbsDialogModelAdapter.d(absDialogModelAdapter, flexboxLayout2);
                ef.e.B(flexboxLayout);
                return;
            case 12:
                Long it2 = (Long) obj;
                TextView textView4 = (TextView) this.f23493e;
                TextView textView5 = (TextView) this.f23492d;
                m.f(it2, "it");
                CardView cardView2 = (CardView) this.f23490b;
                cardView2.setVisibility(0);
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                j jVar = (j) this.f23491c;
                Context context2 = jVar.H;
                if (context2 == null) {
                    m.n("mContext");
                    throw null;
                }
                ObjectAnimator.ofObject(cardView2, "cardBackgroundColor", argbEvaluator, Integer.valueOf(context2.getColor(R.color.color_E1E9F6)), Integer.valueOf(cardView2.getCardBackgroundColor().getDefaultColor())).setDuration(300L).start();
                ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
                Integer numValueOf = Integer.valueOf(textView5.getTextColors().getDefaultColor());
                Context context3 = jVar.H;
                if (context3 == null) {
                    m.n("mContext");
                    throw null;
                }
                ObjectAnimator.ofObject(textView5, "textColor", argbEvaluator2, numValueOf, Integer.valueOf(context3.getColor(R.color.colorAccent))).setDuration(300L).start();
                ArgbEvaluator argbEvaluator3 = new ArgbEvaluator();
                Integer numValueOf2 = Integer.valueOf(textView4.getTextColors().getDefaultColor());
                Context context4 = jVar.H;
                if (context4 != null) {
                    ObjectAnimator.ofObject(textView4, "textColor", argbEvaluator3, numValueOf2, Integer.valueOf(context4.getColor(R.color.colorAccent))).setDuration(300L).start();
                    return;
                } else {
                    m.n("mContext");
                    throw null;
                }
            default:
                Long it3 = (Long) obj;
                m.f(it3, "it");
                ImageView imageView = (ImageView) this.f23490b;
                imageView.setImageResource(0);
                imageView.setBackgroundResource(R.drawable.bg_word_13_check);
                TextView textView6 = (TextView) this.f23491c;
                Context context5 = ((d5) this.f23492d).f47883c;
                m.f(context5, "context");
                textView6.setTextColor(context5.getColor(R.color.second_black));
                ((View) this.f23493e).setEnabled(true);
                return;
        }
    }

    public synchronized void b(g gVar, w wVar) {
        vd.b bVar = (vd.b) ((HashMap) this.f23491c).put(gVar, new vd.b(gVar, wVar, (ReferenceQueue) this.f23492d));
        if (bVar != null) {
            bVar.f53847c = null;
            bVar.clear();
        }
    }

    public void d(vd.b bVar) {
        vd.b0 b0Var;
        synchronized (this) {
            ((HashMap) this.f23491c).remove(bVar.f53845a);
            if (bVar.f53846b && (b0Var = bVar.f53847c) != null) {
                ((o) this.f23493e).d(bVar.f53845a, new w(b0Var, true, false, bVar.f53845a, (o) this.f23493e));
            }
        }
    }

    @Override // b0.l2
    public long e(s sVar, s sVar2, s sVar3) {
        int iB = sVar.b();
        long jMax = 0;
        for (int i11 = 0; i11 < iB; i11++) {
            jMax = Math.max(jMax, ((t) this.f23490b).get(i11).b(sVar.a(i11), sVar2.a(i11), sVar3.a(i11)));
        }
        return jMax;
    }

    public HwCharacterDao f() {
        Object value = ((q) this.f23492d).getValue();
        m.e(value, "getValue(...)");
        return (HwCharacterDao) value;
    }

    @Override // b0.l2
    public s g(s sVar, s sVar2, s sVar3) {
        if (((s) this.f23493e) == null) {
            this.f23493e = sVar3.c();
        }
        s sVar4 = (s) this.f23493e;
        if (sVar4 == null) {
            m.n("endVelocityVector");
            throw null;
        }
        int iB = sVar4.b();
        for (int i11 = 0; i11 < iB; i11++) {
            s sVar5 = (s) this.f23493e;
            if (sVar5 == null) {
                m.n("endVelocityVector");
                throw null;
            }
            sVar5.e(i11, ((t) this.f23490b).get(i11).d(sVar.a(i11), sVar2.a(i11), sVar3.a(i11)));
        }
        s sVar6 = (s) this.f23493e;
        if (sVar6 != null) {
            return sVar6;
        }
        m.n("endVelocityVector");
        throw null;
    }

    @Override // b0.l2
    public s i(long j11, s sVar, s sVar2, s sVar3) {
        if (((s) this.f23491c) == null) {
            this.f23491c = sVar.c();
        }
        s sVar4 = (s) this.f23491c;
        if (sVar4 == null) {
            m.n("valueVector");
            throw null;
        }
        int iB = sVar4.b();
        for (int i11 = 0; i11 < iB; i11++) {
            s sVar5 = (s) this.f23491c;
            if (sVar5 == null) {
                m.n("valueVector");
                throw null;
            }
            sVar5.e(i11, ((t) this.f23490b).get(i11).e(sVar.a(i11), sVar2.a(i11), sVar3.a(i11), j11));
        }
        s sVar6 = (s) this.f23491c;
        if (sVar6 != null) {
            return sVar6;
        }
        m.n("valueVector");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:162:0x047a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    @Override // u8.k
    public void j(byte[] bArr, int i11, int i12, u8.j jVar, b7.g gVar) {
        a7.b bVar;
        Rect rect;
        int i13;
        a7.b bVar2;
        int i14;
        int iW;
        a7.b bVar3;
        int i15;
        int i16;
        int iZ;
        int i17 = this.f23489a;
        int i18 = 2;
        int i19 = 4;
        Object obj = this.f23490b;
        int i21 = 3;
        int i22 = 0;
        switch (i17) {
            case 3:
                b7.w wVar = (b7.w) obj;
                wVar.G(bArr, i11 + i12);
                wVar.I(i11);
                b7.w wVar2 = (b7.w) this.f23491c;
                c9.a aVar = (c9.a) this.f23492d;
                if (((Inflater) this.f23493e) == null) {
                    this.f23493e = new Inflater();
                }
                Inflater inflater = (Inflater) this.f23493e;
                String str = f0.f3975a;
                if (wVar.a() > 0 && (wVar.f4039a[wVar.f4040b] & 255) == 120 && f0.F(wVar, wVar2, inflater)) {
                    wVar.G(wVar2.f4039a, wVar2.f4041c);
                }
                aVar.f6739c = false;
                aVar.f6743g = null;
                aVar.f6744h = -1;
                aVar.f6745i = -1;
                int iA = wVar.a();
                if (iA < 2 || wVar.C() != iA) {
                    bVar = null;
                } else {
                    int[] iArr = aVar.f6740d;
                    if (iArr != null && aVar.f6738b) {
                        wVar.J(wVar.C() - 2);
                        int iC = wVar.C();
                        int[] iArr2 = aVar.f6737a;
                        while (wVar.f4040b < iC && wVar.a() > 0) {
                            switch (wVar.w()) {
                                case 0:
                                case 1:
                                case 2:
                                    continue;
                                case 3:
                                    if (wVar.a() >= 2) {
                                        int iW2 = wVar.w();
                                        int iW3 = wVar.w();
                                        iArr2[3] = c9.a.a(iArr, iW2 >> 4);
                                        iArr2[2] = c9.a.a(iArr, iW2 & 15);
                                        iArr2[1] = c9.a.a(iArr, iW3 >> 4);
                                        iArr2[0] = c9.a.a(iArr, iW3 & 15);
                                        aVar.f6739c = true;
                                    }
                                    break;
                                case 4:
                                    if (wVar.a() >= 2 && aVar.f6739c) {
                                        int iW4 = wVar.w();
                                        int iW5 = wVar.w();
                                        iArr2[3] = c9.a.c(iArr2[3], iW4 >> 4);
                                        iArr2[2] = c9.a.c(iArr2[2], iW4 & 15);
                                        iArr2[1] = c9.a.c(iArr2[1], iW5 >> 4);
                                        iArr2[0] = c9.a.c(iArr2[0], iW5 & 15);
                                    }
                                    break;
                                case 5:
                                    if (wVar.a() >= 6) {
                                        int iW6 = wVar.w();
                                        int iW7 = wVar.w();
                                        int i23 = (iW6 << 4) | (iW7 >> 4);
                                        int iW8 = ((iW7 & 15) << 8) | wVar.w();
                                        int iW9 = wVar.w();
                                        int iW10 = wVar.w();
                                        aVar.f6743g = new Rect(i23, (iW9 << 4) | (iW10 >> 4), iW8 + 1, (((iW10 & 15) << 8) | wVar.w()) + 1);
                                    }
                                    break;
                                case 6:
                                    if (wVar.a() >= 4) {
                                        aVar.f6744h = wVar.C();
                                        aVar.f6745i = wVar.C();
                                    }
                                    break;
                            }
                        }
                    }
                    if (aVar.f6740d == null || !aVar.f6738b || !aVar.f6739c || (rect = aVar.f6743g) == null || aVar.f6744h == -1 || aVar.f6745i == -1 || rect.width() < 2 || aVar.f6743g.height() < 2) {
                        bVar = null;
                    } else {
                        Rect rect2 = aVar.f6743g;
                        int[] iArr3 = new int[rect2.height() * rect2.width()];
                        v vVar = new v();
                        wVar.I(aVar.f6744h);
                        vVar.o(wVar);
                        aVar.b(vVar, true, rect2, iArr3);
                        wVar.I(aVar.f6745i);
                        vVar.o(wVar);
                        aVar.b(vVar, false, rect2, iArr3);
                        bVar = new a7.b(null, null, null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar.f6742f, 0, 0, rect2.left / aVar.f6741e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / aVar.f6741e, rect2.height() / aVar.f6742f, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                    }
                }
                gVar.accept(new u8.a(-9223372036854775807L, 5000000L, bVar != null ? ImmutableList.u(bVar) : ImmutableList.s()));
                break;
            default:
                x8.a aVar2 = (x8.a) this.f23492d;
                b7.w wVar3 = (b7.w) this.f23491c;
                b7.w wVar4 = (b7.w) obj;
                wVar4.G(bArr, i11 + i12);
                wVar4.I(i11);
                if (((Inflater) this.f23493e) == null) {
                    this.f23493e = new Inflater();
                }
                Inflater inflater2 = (Inflater) this.f23493e;
                String str2 = f0.f3975a;
                if (wVar4.a() > 0 && (wVar4.f4039a[wVar4.f4040b] & 255) == 120 && f0.F(wVar4, wVar3, inflater2)) {
                    wVar4.G(wVar3.f4039a, wVar3.f4041c);
                }
                aVar2.f55964d = 0;
                int[] iArr4 = aVar2.f55962b;
                b7.w wVar5 = aVar2.f55961a;
                aVar2.f55965e = 0;
                aVar2.f55966f = 0;
                aVar2.f55967g = 0;
                aVar2.f55968h = 0;
                aVar2.f55969i = 0;
                wVar5.F(0);
                aVar2.f55963c = false;
                ArrayList arrayList = new ArrayList();
                while (wVar4.a() >= i21) {
                    int i24 = wVar4.f4041c;
                    int iW11 = wVar4.w();
                    int iC2 = wVar4.C();
                    int i25 = wVar4.f4040b + iC2;
                    if (i25 > i24) {
                        wVar4.I(i24);
                        i13 = i21;
                        bVar3 = null;
                    } else {
                        char c11 = 128;
                        if (iW11 != 128) {
                            switch (iW11) {
                                case 20:
                                    if (iC2 % 5 == i18) {
                                        wVar4.J(i18);
                                        Arrays.fill(iArr4, i22);
                                        int i26 = iC2 / 5;
                                        int i27 = i22;
                                        while (i27 < i26) {
                                            int iW12 = wVar4.w();
                                            char c12 = c11;
                                            double dW = wVar4.w();
                                            double dW2 = wVar4.w() - 128;
                                            int i28 = (int) ((1.402d * dW2) + dW);
                                            double dW3 = wVar4.w() - 128;
                                            iArr4[iW12] = (f0.g(i28, 0, 255) << 16) | (wVar4.w() << 24) | (f0.g((int) ((dW - (0.34414d * dW3)) - (dW2 * 0.71414d)), 0, 255) << 8) | f0.g((int) ((dW3 * 1.772d) + dW), 0, 255);
                                            i27++;
                                            c11 = c12;
                                            i26 = i26;
                                            i21 = i21;
                                        }
                                        i13 = i21;
                                        aVar2.f55963c = true;
                                    } else {
                                        i13 = i21;
                                    }
                                    break;
                                case 21:
                                    if (iC2 >= i19) {
                                        wVar4.J(i21);
                                        int i29 = iC2 - 4;
                                        if (((128 & wVar4.w()) != 0 ? 1 : i22) == 0) {
                                            i15 = wVar5.f4040b;
                                            i16 = wVar5.f4041c;
                                            if (i15 < i16 && i29 > 0) {
                                                int iMin = Math.min(i29, i16 - i15);
                                                wVar4.h(wVar5.f4039a, i15, iMin);
                                                wVar5.I(i15 + iMin);
                                            }
                                        } else if (i29 >= 7 && (iZ = wVar4.z()) >= i19) {
                                            aVar2.f55968h = wVar4.C();
                                            aVar2.f55969i = wVar4.C();
                                            wVar5.F(iZ - 4);
                                            i29 = iC2 - 11;
                                            i15 = wVar5.f4040b;
                                            i16 = wVar5.f4041c;
                                            if (i15 < i16) {
                                                int iMin2 = Math.min(i29, i16 - i15);
                                                wVar4.h(wVar5.f4039a, i15, iMin2);
                                                wVar5.I(i15 + iMin2);
                                            }
                                        }
                                    }
                                    i13 = i21;
                                    break;
                                case 22:
                                    if (iC2 >= 19) {
                                        aVar2.f55964d = wVar4.C();
                                        aVar2.f55965e = wVar4.C();
                                        wVar4.J(11);
                                        aVar2.f55966f = wVar4.C();
                                        aVar2.f55967g = wVar4.C();
                                    }
                                    i13 = i21;
                                    break;
                                default:
                                    i13 = i21;
                                    break;
                            }
                            bVar2 = null;
                        } else {
                            i13 = i21;
                            if (aVar2.f55964d == 0 || aVar2.f55965e == 0 || aVar2.f55968h == 0 || aVar2.f55969i == 0 || (i14 = wVar5.f4041c) == 0 || wVar5.f4040b != i14 || !aVar2.f55963c) {
                                bVar2 = null;
                            } else {
                                wVar5.I(0);
                                int i30 = aVar2.f55968h * aVar2.f55969i;
                                int[] iArr5 = new int[i30];
                                int i31 = 0;
                                while (i31 < i30) {
                                    int iW13 = wVar5.w();
                                    if (iW13 != 0) {
                                        iW = i31 + 1;
                                        iArr5[i31] = iArr4[iW13];
                                    } else {
                                        int iW14 = wVar5.w();
                                        if (iW14 != 0) {
                                            iW = ((iW14 & 64) == 0 ? iW14 & 63 : ((iW14 & 63) << 8) | wVar5.w()) + i31;
                                            Arrays.fill(iArr5, i31, iW, (iW14 & 128) == 0 ? iArr4[0] : iArr4[wVar5.w()]);
                                        }
                                    }
                                    i31 = iW;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr5, aVar2.f55968h, aVar2.f55969i, Bitmap.Config.ARGB_8888);
                                float f5 = aVar2.f55966f;
                                float f11 = aVar2.f55964d;
                                float f12 = f5 / f11;
                                float f13 = aVar2.f55967g;
                                float f14 = aVar2.f55965e;
                                bVar2 = new a7.b(null, null, null, bitmapCreateBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar2.f55968h / f11, aVar2.f55969i / f14, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                            }
                            aVar2.f55964d = 0;
                            aVar2.f55965e = 0;
                            aVar2.f55966f = 0;
                            aVar2.f55967g = 0;
                            aVar2.f55968h = 0;
                            aVar2.f55969i = 0;
                            wVar5.F(0);
                            aVar2.f55963c = false;
                        }
                        wVar4.I(i25);
                        bVar3 = bVar2;
                    }
                    if (bVar3 != null) {
                        arrayList.add(bVar3);
                    }
                    i21 = i13;
                    i18 = 2;
                    i19 = 4;
                    i22 = 0;
                }
                gVar.accept(new u8.a(-9223372036854775807L, -9223372036854775807L, arrayList));
                break;
        }
    }

    public void k() {
        View view = (View) this.f23492d;
        m.c(view);
        Switch r9 = (Switch) view.findViewById(R.id.switch_sound_effect);
        m.c(r9);
        z.b(r9, new f(this, r9, 2));
        Env env = (Env) this.f23491c;
        r9.setChecked(env.allowSoundEffect);
        View view2 = (View) this.f23492d;
        m.c(view2);
        Switch r11 = (Switch) view2.findViewById(R.id.switch_animation);
        m.c(r11);
        z.b(r11, new f(this, r11, 1));
        r11.setChecked(env.showAnim);
        View view3 = (View) this.f23492d;
        m.c(view3);
        RadioGroup radioGroup = (RadioGroup) view3.findViewById(R.id.radio_group_theme);
        View childAt = radioGroup.getChildAt(env.themeStyle);
        if (childAt instanceof RadioButton) {
            ((RadioButton) childAt).setChecked(true);
        } else {
            m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            View childAt2 = ((FrameLayout) childAt).getChildAt(0);
            m.d(childAt2, "null cannot be cast to non-null type android.widget.RadioButton");
            ((RadioButton) childAt2).setChecked(true);
        }
        radioGroup.setOnCheckedChangeListener(new lp.d(this, 7));
        View view4 = (View) this.f23492d;
        m.c(view4);
        RadioGroup radioGroup2 = (RadioGroup) view4.findViewById(R.id.radio_group_text_size);
        View childAt3 = radioGroup2.getChildAt(FontSizeStyleKt.legacyFontSizeStyleGroup(env.textSizeDel));
        m.d(childAt3, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt3).setChecked(true);
        radioGroup2.setOnCheckedChangeListener(new lp.d(this, 8));
        View view5 = (View) this.f23492d;
        if (view5 != null) {
            final TextView textView = (TextView) view5.findViewById(R.id.tv_speed);
            ImageView imageView = (ImageView) view5.findViewById(R.id.iv_remove_speed);
            ImageView imageView2 = (ImageView) view5.findViewById(R.id.iv_plus_speed);
            textView.setText(env.audioSpeed + "%");
            m.c(imageView2);
            final int i11 = 1;
            z.b(imageView2, new fz.c(this) { // from class: lp.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ dm.c f40189b;

                {
                    this.f40189b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            Env env2 = (Env) this.f40189b.f23491c;
                            int i12 = env2.audioSpeed;
                            if (i12 > 50) {
                                env2.audioSpeed = i12 - 10;
                                env2.updateEntry("audioSpeed");
                                String.valueOf(env2.audioSpeed);
                                textView.setText(env2.audioSpeed + "%");
                            }
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            dm.c cVar = this.f40189b;
                            Env env3 = (Env) cVar.f23491c;
                            int i13 = env3.audioSpeed;
                            if (i13 < 150) {
                                env3.audioSpeed = i13 + 10;
                                env3.updateEntry("audioSpeed");
                                textView.setText(((Env) cVar.f23491c).audioSpeed + "%");
                            }
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            m.c(imageView);
            final int i12 = 0;
            z.b(imageView, new fz.c(this) { // from class: lp.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ dm.c f40189b;

                {
                    this.f40189b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            Env env2 = (Env) this.f40189b.f23491c;
                            int i13 = env2.audioSpeed;
                            if (i13 > 50) {
                                env2.audioSpeed = i13 - 10;
                                env2.updateEntry("audioSpeed");
                                String.valueOf(env2.audioSpeed);
                                textView.setText(env2.audioSpeed + "%");
                            }
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            dm.c cVar = this.f40189b;
                            Env env3 = (Env) cVar.f23491c;
                            int i14 = env3.audioSpeed;
                            if (i14 < 150) {
                                env3.audioSpeed = i14 + 10;
                                env3.updateEntry("audioSpeed");
                                textView.setText(((Env) cVar.f23491c).audioSpeed + "%");
                            }
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
        }
    }

    @Override // u8.k
    public int l() {
        switch (this.f23489a) {
        }
        return 2;
    }

    @Override // b0.l2
    public s m(long j11, s sVar, s sVar2, s sVar3) {
        if (((s) this.f23492d) == null) {
            this.f23492d = sVar3.c();
        }
        s sVar4 = (s) this.f23492d;
        if (sVar4 == null) {
            m.n("velocityVector");
            throw null;
        }
        int iB = sVar4.b();
        for (int i11 = 0; i11 < iB; i11++) {
            s sVar5 = (s) this.f23492d;
            if (sVar5 == null) {
                m.n("velocityVector");
                throw null;
            }
            sVar5.e(i11, ((t) this.f23490b).get(i11).c(sVar.a(i11), sVar2.a(i11), sVar3.a(i11), j11));
        }
        s sVar6 = (s) this.f23492d;
        if (sVar6 != null) {
            return sVar6;
        }
        m.n("velocityVector");
        throw null;
    }

    public c(LingoSkillApplication lingoSkillApplication) {
        this.f23489a = 0;
        this.f23490b = com.bumptech.glide.d.v(new com.google.firebase.sessions.a(lingoSkillApplication, 3));
        final int i11 = 0;
        this.f23491c = com.bumptech.glide.d.v(new fz.a(this) { // from class: dm.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f23487b;

            {
                this.f23487b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new DaoMaster(((d) ((q) this.f23487b.f23490b).getValue()).getWritableDatabase()).m210newSession();
                    case 1:
                        Object value = ((q) this.f23487b.f23491c).getValue();
                        m.e(value, "getValue(...)");
                        return ((DaoSession) value).getHwCharacterDao();
                    case 2:
                        Object value2 = ((q) this.f23487b.f23491c).getValue();
                        m.e(value2, "getValue(...)");
                        return ((DaoSession) value2).getHwCharPartDao();
                    default:
                        ArrayList arrayList = new ArrayList();
                        List<Object> listLoadAll = this.f23487b.f().loadAll();
                        int i12 = 0;
                        while (i12 < 10) {
                            CharGroup charGroup = new CharGroup();
                            charGroup.setIndex(i12);
                            ArrayList arrayList2 = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i13 = 0; i13 < 10; i13++) {
                                HwCharacter hwCharacter = (HwCharacter) listLoadAll.get((i12 * 10) + i13);
                                arrayList2.add(Long.valueOf(hwCharacter.getCharId()));
                                sb2.append(hwCharacter.getCharacter() + " ");
                            }
                            i12++;
                            charGroup.setName("Group " + i12);
                            charGroup.setIds(arrayList2);
                            charGroup.setDesc(sb2.toString());
                            arrayList.add(charGroup);
                        }
                        return arrayList;
                }
            }
        });
        final int i12 = 1;
        this.f23492d = com.bumptech.glide.d.v(new fz.a(this) { // from class: dm.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f23487b;

            {
                this.f23487b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new DaoMaster(((d) ((q) this.f23487b.f23490b).getValue()).getWritableDatabase()).m210newSession();
                    case 1:
                        Object value = ((q) this.f23487b.f23491c).getValue();
                        m.e(value, "getValue(...)");
                        return ((DaoSession) value).getHwCharacterDao();
                    case 2:
                        Object value2 = ((q) this.f23487b.f23491c).getValue();
                        m.e(value2, "getValue(...)");
                        return ((DaoSession) value2).getHwCharPartDao();
                    default:
                        ArrayList arrayList = new ArrayList();
                        List<Object> listLoadAll = this.f23487b.f().loadAll();
                        int i13 = 0;
                        while (i13 < 10) {
                            CharGroup charGroup = new CharGroup();
                            charGroup.setIndex(i13);
                            ArrayList arrayList2 = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i14 = 0; i14 < 10; i14++) {
                                HwCharacter hwCharacter = (HwCharacter) listLoadAll.get((i13 * 10) + i14);
                                arrayList2.add(Long.valueOf(hwCharacter.getCharId()));
                                sb2.append(hwCharacter.getCharacter() + " ");
                            }
                            i13++;
                            charGroup.setName("Group " + i13);
                            charGroup.setIds(arrayList2);
                            charGroup.setDesc(sb2.toString());
                            arrayList.add(charGroup);
                        }
                        return arrayList;
                }
            }
        });
        final int i13 = 2;
        this.f23493e = com.bumptech.glide.d.v(new fz.a(this) { // from class: dm.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f23487b;

            {
                this.f23487b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new DaoMaster(((d) ((q) this.f23487b.f23490b).getValue()).getWritableDatabase()).m210newSession();
                    case 1:
                        Object value = ((q) this.f23487b.f23491c).getValue();
                        m.e(value, "getValue(...)");
                        return ((DaoSession) value).getHwCharacterDao();
                    case 2:
                        Object value2 = ((q) this.f23487b.f23491c).getValue();
                        m.e(value2, "getValue(...)");
                        return ((DaoSession) value2).getHwCharPartDao();
                    default:
                        ArrayList arrayList = new ArrayList();
                        List<Object> listLoadAll = this.f23487b.f().loadAll();
                        int i14 = 0;
                        while (i14 < 10) {
                            CharGroup charGroup = new CharGroup();
                            charGroup.setIndex(i14);
                            ArrayList arrayList2 = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i15 = 0; i15 < 10; i15++) {
                                HwCharacter hwCharacter = (HwCharacter) listLoadAll.get((i14 * 10) + i15);
                                arrayList2.add(Long.valueOf(hwCharacter.getCharId()));
                                sb2.append(hwCharacter.getCharacter() + " ");
                            }
                            i14++;
                            charGroup.setName("Group " + i14);
                            charGroup.setIds(arrayList2);
                            charGroup.setDesc(sb2.toString());
                            arrayList.add(charGroup);
                        }
                        return arrayList;
                }
            }
        });
        final int i14 = 3;
        com.bumptech.glide.d.v(new fz.a(this) { // from class: dm.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f23487b;

            {
                this.f23487b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new DaoMaster(((d) ((q) this.f23487b.f23490b).getValue()).getWritableDatabase()).m210newSession();
                    case 1:
                        Object value = ((q) this.f23487b.f23491c).getValue();
                        m.e(value, "getValue(...)");
                        return ((DaoSession) value).getHwCharacterDao();
                    case 2:
                        Object value2 = ((q) this.f23487b.f23491c).getValue();
                        m.e(value2, "getValue(...)");
                        return ((DaoSession) value2).getHwCharPartDao();
                    default:
                        ArrayList arrayList = new ArrayList();
                        List<Object> listLoadAll = this.f23487b.f().loadAll();
                        int i15 = 0;
                        while (i15 < 10) {
                            CharGroup charGroup = new CharGroup();
                            charGroup.setIndex(i15);
                            ArrayList arrayList2 = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i16 = 0; i16 < 10; i16++) {
                                HwCharacter hwCharacter = (HwCharacter) listLoadAll.get((i15 * 10) + i16);
                                arrayList2.add(Long.valueOf(hwCharacter.getCharId()));
                                sb2.append(hwCharacter.getCharacter() + " ");
                            }
                            i15++;
                            charGroup.setName("Group " + i15);
                            charGroup.setIds(arrayList2);
                            charGroup.setDesc(sb2.toString());
                            arrayList.add(charGroup);
                        }
                        return arrayList;
                }
            }
        });
    }

    public c(Context mContext, Env mEnv) {
        this.f23489a = 8;
        m.f(mContext, "mContext");
        m.f(mEnv, "mEnv");
        this.f23490b = mContext;
        this.f23491c = mEnv;
    }

    public c(rz.b0 b0Var, o0 o0Var, kb.e eVar) {
        this.f23489a = 11;
        this.f23490b = b0Var;
        this.f23491c = eVar;
        this.f23492d = p.b(Integer.MAX_VALUE, 6, null);
        this.f23493e = new a(28);
        g1 g1Var = (g1) b0Var.getCoroutineContext().get(rz.z.f50978b);
        if (g1Var != null) {
            g1Var.invokeOnCompletion(new a0.e(18, o0Var, this));
        }
    }

    public c(int i11) {
        this.f23489a = i11;
        switch (i11) {
            case 14:
                this.f23490b = new y.e(0);
                this.f23491c = new SparseArray();
                this.f23492d = new r((Object) null);
                this.f23493e = new y.e(0);
                break;
            case 15:
            case 16:
            default:
                n3 n3Var = n3.f42585c;
                this.f23491c = j5.a();
                this.f23492d = j5.a();
                this.f23493e = j5.a();
                this.f23490b = n3Var;
                break;
            case 17:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new vd.a(0));
                this.f23491c = new HashMap();
                this.f23492d = new ReferenceQueue();
                this.f23490b = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new py.b(this, 8));
                break;
            case 18:
                this.f23490b = new b7.w();
                this.f23491c = new b7.w();
                this.f23492d = new x8.a();
                break;
        }
    }

    public c(List list) {
        int i11;
        this.f23489a = 3;
        this.f23490b = new b7.w();
        this.f23491c = new b7.w();
        c9.a aVar = new c9.a();
        this.f23492d = aVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = f0.f3975a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                aVar.f6740d = new int[strArrSplit.length];
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    int[] iArr = aVar.f6740d;
                    try {
                        i11 = Integer.parseInt(strArrSplit[i12].trim(), 16);
                    } catch (RuntimeException unused) {
                        i11 = 0;
                    }
                    iArr[i12] = i11;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        aVar.f6741e = Integer.parseInt(strArrSplit2[0]);
                        aVar.f6742f = Integer.parseInt(strArrSplit2[1]);
                        aVar.f6738b = true;
                    } catch (RuntimeException e8) {
                        b7.a.C("Parsing IDX failed", e8);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(n4.p pVar) {
        Bundle bundle;
        int i11;
        ArrayList arrayList;
        Bundle bundle2;
        int i12;
        this.f23489a = 10;
        new ArrayList();
        this.f23493e = new Bundle();
        this.f23492d = pVar;
        Context context = pVar.f43211a;
        ArrayList arrayList2 = pVar.f43229t;
        ArrayList arrayList3 = pVar.f43213c;
        ArrayList arrayList4 = pVar.f43214d;
        this.f23490b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f23491c = n4.q.a(context, pVar.f43226q);
        } else {
            this.f23491c = new Notification.Builder(context);
        }
        Notification notification = pVar.f43228s;
        Context context2 = null;
        ((Notification.Builder) this.f23491c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(pVar.f43215e).setContentText(pVar.f43216f).setContentInfo(null).setContentIntent(pVar.f43217g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(pVar.f43219i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f23491c;
        IconCompat iconCompat = pVar.f43218h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.f23491c).setSubText(null).setUsesChronometer(false).setPriority(pVar.f43220j);
        ArrayList arrayList5 = pVar.f43212b;
        int size = arrayList5.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList5.get(i13);
            i13++;
            n4.j jVar = (n4.j) obj;
            int i14 = Build.VERSION.SDK_INT;
            if (jVar.f43201b == null && (i12 = jVar.f43204e) != 0) {
                jVar.f43201b = IconCompat.b(i12);
            }
            IconCompat iconCompat2 = jVar.f43201b;
            boolean z11 = jVar.f43202c;
            Bundle bundle3 = jVar.f43200a;
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = arrayList3;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, jVar.f43205f, jVar.f43206g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z11);
            builder2.setAllowGeneratedReplies(z11);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i14 >= 28) {
                n4.r.a(builder2);
            }
            if (i14 >= 29) {
                n4.f.d(builder2);
            }
            if (i14 >= 31) {
                n4.s.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", jVar.f43203d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f23491c).addAction(builder2.build());
            arrayList5 = arrayList6;
            arrayList3 = arrayList7;
            context2 = null;
        }
        ArrayList arrayList8 = arrayList3;
        Bundle bundle4 = pVar.f43223n;
        if (bundle4 != null) {
            ((Bundle) this.f23493e).putAll(bundle4);
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f23491c).setShowWhen(pVar.f43221k);
        ((Notification.Builder) this.f23491c).setLocalOnly(pVar.m);
        ((Notification.Builder) this.f23491c).setGroup(null);
        ((Notification.Builder) this.f23491c).setSortKey(null);
        ((Notification.Builder) this.f23491c).setGroupSummary(false);
        ((Notification.Builder) this.f23491c).setCategory(null);
        ((Notification.Builder) this.f23491c).setColor(pVar.f43224o);
        ((Notification.Builder) this.f23491c).setVisibility(pVar.f43225p);
        ((Notification.Builder) this.f23491c).setPublicVersion(null);
        ((Notification.Builder) this.f23491c).setSound(notification.sound, notification.audioAttributes);
        if (i15 < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    y.f fVar = new y.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj2 = arrayList2.get(i16);
                i16++;
                ((Notification.Builder) this.f23491c).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (pVar.f43223n == null) {
                pVar.f43223n = new Bundle();
            }
            Bundle bundle5 = pVar.f43223n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                String string = Integer.toString(i17);
                n4.j jVar2 = (n4.j) arrayList4.get(i17);
                Bundle bundle8 = new Bundle();
                if (jVar2.f43201b == null && (i11 = jVar2.f43204e) != 0) {
                    jVar2.f43201b = IconCompat.b(i11);
                }
                IconCompat iconCompat3 = jVar2.f43201b;
                Bundle bundle9 = jVar2.f43200a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", jVar2.f43205f);
                bundle8.putParcelable("actionIntent", jVar2.f43206g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", jVar2.f43202c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", jVar2.f43203d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (pVar.f43223n == null) {
                pVar.f43223n = new Bundle();
            }
            pVar.f43223n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f23493e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i18 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f23491c).setExtras(pVar.f43223n);
        ((Notification.Builder) this.f23491c).setRemoteInputHistory(null);
        if (i18 >= 26) {
            n4.q.b((Notification.Builder) this.f23491c);
            n4.q.d((Notification.Builder) this.f23491c);
            n4.q.e((Notification.Builder) this.f23491c);
            n4.q.f((Notification.Builder) this.f23491c);
            n4.q.c((Notification.Builder) this.f23491c);
            if (!TextUtils.isEmpty(pVar.f43226q)) {
                ((Notification.Builder) this.f23491c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i18 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i18 >= 29) {
            n4.f.b((Notification.Builder) this.f23491c, pVar.f43227r);
            n4.f.c((Notification.Builder) this.f23491c);
        }
    }

    public c(t tVar) {
        this.f23489a = 1;
        this.f23490b = tVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(d0 d0Var) {
        this(new a5.j(d0Var, 2));
        this.f23489a = 1;
    }

    public c(p7.g1 g1Var, boolean[] zArr) {
        this.f23489a = 13;
        this.f23490b = g1Var;
        this.f23491c = zArr;
        int i11 = g1Var.f46388a;
        this.f23492d = new boolean[i11];
        this.f23493e = new boolean[i11];
    }
}

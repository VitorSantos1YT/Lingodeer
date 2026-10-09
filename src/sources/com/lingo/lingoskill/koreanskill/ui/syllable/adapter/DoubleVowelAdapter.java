package com.lingo.lingoskill.koreanskill.ui.syllable.adapter;

import a9.i;
import android.support.v4.media.session.a;
import android.view.View;
import android.widget.ImageView;
import b7.e0;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.koreanskill.ui.syllable.adapter.DoubleVowelAdapter;
import com.lingodeer.R;
import dn.b;
import fz.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import qy.b0;
import qy.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DoubleVowelAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f21909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f21910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleVowelAdapter(ArrayList arrayList, i mPlayer) {
        super(R.layout.item_ko_syllable_study_simple_3, arrayList);
        m.f(mPlayer, "mPlayer");
        this.f21909a = mPlayer;
    }

    public final void a(ImageView imageView, String str) {
        b bVar = this.f21910b;
        if (bVar != null) {
            bVar.a();
        }
        b bVar2 = new b(imageView, 0);
        this.f21910b = bVar2;
        i iVar = this.f21909a;
        iVar.f521e = bVar2;
        q qVar = fv.b.f28186a;
        m.c(str);
        iVar.v(fv.b.c(str, null, null));
        a.K(imageView.getBackground());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        List listK;
        Collection collectionT;
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        Pattern patternCompile = Pattern.compile("#");
        m.e(patternCompile, "compile(...)");
        oz.q.U0(0);
        Matcher matcher = patternCompile.matcher(item);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcher, item, iC, arrayList);
            } while (matcher.find());
            p.B(iC, item, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(item.toString());
        }
        if (listK.isEmpty()) {
            collectionT = r.f50854a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                }
            }
            collectionT = r.f50854a;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        String str2 = strArr[0];
        String str3 = strArr[1];
        String str4 = strArr[2];
        se.p.V();
        final String strA = wm.a.a(str2);
        se.p.V();
        final String strA2 = wm.a.a(str3);
        se.p.V();
        final String strA3 = wm.a.a(str4);
        helper.setText(R.id.tv_char, str2);
        helper.setText(R.id.tv_char_part_1, str3);
        helper.setText(R.id.tv_char_part_2, str4);
        helper.setText(R.id.tv_char_zhuyin, strA);
        helper.setText(R.id.tv_char_part_1_zhuyin, strA2);
        helper.setText(R.id.tv_char_part_2_zhuyin, strA3);
        final ImageView imageView = (ImageView) helper.getView(R.id.iv_audio);
        View view = helper.getView(R.id.iv_audio);
        m.e(view, "getView(...)");
        final int i11 = 0;
        z.b(view, new c(this) { // from class: dn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleVowelAdapter f23495b;

            {
                this.f23495b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View view2 = (View) obj;
                switch (i11) {
                    case 0:
                        m.f(view2, "<unused var>");
                        ImageView imageView2 = imageView;
                        m.c(imageView2);
                        this.f23495b.a(imageView2, strA);
                        break;
                    case 1:
                        m.f(view2, "<unused var>");
                        ImageView imageView3 = imageView;
                        m.c(imageView3);
                        this.f23495b.a(imageView3, strA);
                        break;
                    case 2:
                        m.f(view2, "<unused var>");
                        ImageView imageView4 = imageView;
                        m.c(imageView4);
                        this.f23495b.a(imageView4, strA);
                        break;
                    case 3:
                        m.f(view2, scNRoQgKSYX.YHpiL);
                        ImageView imageView5 = imageView;
                        m.c(imageView5);
                        this.f23495b.a(imageView5, strA);
                        break;
                    case 4:
                        m.f(view2, "<unused var>");
                        ImageView imageView6 = imageView;
                        m.c(imageView6);
                        this.f23495b.a(imageView6, strA);
                        break;
                    case 5:
                        m.f(view2, "<unused var>");
                        ImageView imageView7 = imageView;
                        m.c(imageView7);
                        this.f23495b.a(imageView7, strA);
                        break;
                    default:
                        m.f(view2, "<unused var>");
                        ImageView imageView8 = imageView;
                        m.c(imageView8);
                        this.f23495b.a(imageView8, strA);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view2 = helper.getView(R.id.tv_char);
        m.e(view2, "getView(...)");
        final int i12 = 1;
        z.b(view2, new c(this) { // from class: dn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleVowelAdapter f23495b;

            {
                this.f23495b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View view3 = (View) obj;
                switch (i12) {
                    case 0:
                        m.f(view3, "<unused var>");
                        ImageView imageView2 = imageView;
                        m.c(imageView2);
                        this.f23495b.a(imageView2, strA);
                        break;
                    case 1:
                        m.f(view3, "<unused var>");
                        ImageView imageView3 = imageView;
                        m.c(imageView3);
                        this.f23495b.a(imageView3, strA);
                        break;
                    case 2:
                        m.f(view3, "<unused var>");
                        ImageView imageView4 = imageView;
                        m.c(imageView4);
                        this.f23495b.a(imageView4, strA);
                        break;
                    case 3:
                        m.f(view3, scNRoQgKSYX.YHpiL);
                        ImageView imageView5 = imageView;
                        m.c(imageView5);
                        this.f23495b.a(imageView5, strA);
                        break;
                    case 4:
                        m.f(view3, "<unused var>");
                        ImageView imageView6 = imageView;
                        m.c(imageView6);
                        this.f23495b.a(imageView6, strA);
                        break;
                    case 5:
                        m.f(view3, "<unused var>");
                        ImageView imageView7 = imageView;
                        m.c(imageView7);
                        this.f23495b.a(imageView7, strA);
                        break;
                    default:
                        m.f(view3, "<unused var>");
                        ImageView imageView8 = imageView;
                        m.c(imageView8);
                        this.f23495b.a(imageView8, strA);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view3 = helper.getView(R.id.tv_char_zhuyin);
        m.e(view3, "getView(...)");
        final int i13 = 2;
        z.b(view3, new c(this) { // from class: dn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleVowelAdapter f23495b;

            {
                this.f23495b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View view4 = (View) obj;
                switch (i13) {
                    case 0:
                        m.f(view4, "<unused var>");
                        ImageView imageView2 = imageView;
                        m.c(imageView2);
                        this.f23495b.a(imageView2, strA);
                        break;
                    case 1:
                        m.f(view4, "<unused var>");
                        ImageView imageView3 = imageView;
                        m.c(imageView3);
                        this.f23495b.a(imageView3, strA);
                        break;
                    case 2:
                        m.f(view4, "<unused var>");
                        ImageView imageView4 = imageView;
                        m.c(imageView4);
                        this.f23495b.a(imageView4, strA);
                        break;
                    case 3:
                        m.f(view4, scNRoQgKSYX.YHpiL);
                        ImageView imageView5 = imageView;
                        m.c(imageView5);
                        this.f23495b.a(imageView5, strA);
                        break;
                    case 4:
                        m.f(view4, "<unused var>");
                        ImageView imageView6 = imageView;
                        m.c(imageView6);
                        this.f23495b.a(imageView6, strA);
                        break;
                    case 5:
                        m.f(view4, "<unused var>");
                        ImageView imageView7 = imageView;
                        m.c(imageView7);
                        this.f23495b.a(imageView7, strA);
                        break;
                    default:
                        m.f(view4, "<unused var>");
                        ImageView imageView8 = imageView;
                        m.c(imageView8);
                        this.f23495b.a(imageView8, strA);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view4 = helper.getView(R.id.tv_char_part_1);
        m.e(view4, "getView(...)");
        final int i14 = 3;
        z.b(view4, new c(this) { // from class: dn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleVowelAdapter f23495b;

            {
                this.f23495b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View view5 = (View) obj;
                switch (i14) {
                    case 0:
                        m.f(view5, "<unused var>");
                        ImageView imageView2 = imageView;
                        m.c(imageView2);
                        this.f23495b.a(imageView2, strA2);
                        break;
                    case 1:
                        m.f(view5, "<unused var>");
                        ImageView imageView3 = imageView;
                        m.c(imageView3);
                        this.f23495b.a(imageView3, strA2);
                        break;
                    case 2:
                        m.f(view5, "<unused var>");
                        ImageView imageView4 = imageView;
                        m.c(imageView4);
                        this.f23495b.a(imageView4, strA2);
                        break;
                    case 3:
                        m.f(view5, scNRoQgKSYX.YHpiL);
                        ImageView imageView5 = imageView;
                        m.c(imageView5);
                        this.f23495b.a(imageView5, strA2);
                        break;
                    case 4:
                        m.f(view5, "<unused var>");
                        ImageView imageView6 = imageView;
                        m.c(imageView6);
                        this.f23495b.a(imageView6, strA2);
                        break;
                    case 5:
                        m.f(view5, "<unused var>");
                        ImageView imageView7 = imageView;
                        m.c(imageView7);
                        this.f23495b.a(imageView7, strA2);
                        break;
                    default:
                        m.f(view5, "<unused var>");
                        ImageView imageView8 = imageView;
                        m.c(imageView8);
                        this.f23495b.a(imageView8, strA2);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view5 = helper.getView(R.id.tv_char_part_1_zhuyin);
        m.e(view5, "getView(...)");
        final int i15 = 4;
        z.b(view5, new c(this) { // from class: dn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleVowelAdapter f23495b;

            {
                this.f23495b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View view6 = (View) obj;
                switch (i15) {
                    case 0:
                        m.f(view6, "<unused var>");
                        ImageView imageView2 = imageView;
                        m.c(imageView2);
                        this.f23495b.a(imageView2, strA2);
                        break;
                    case 1:
                        m.f(view6, "<unused var>");
                        ImageView imageView3 = imageView;
                        m.c(imageView3);
                        this.f23495b.a(imageView3, strA2);
                        break;
                    case 2:
                        m.f(view6, "<unused var>");
                        ImageView imageView4 = imageView;
                        m.c(imageView4);
                        this.f23495b.a(imageView4, strA2);
                        break;
                    case 3:
                        m.f(view6, scNRoQgKSYX.YHpiL);
                        ImageView imageView5 = imageView;
                        m.c(imageView5);
                        this.f23495b.a(imageView5, strA2);
                        break;
                    case 4:
                        m.f(view6, "<unused var>");
                        ImageView imageView6 = imageView;
                        m.c(imageView6);
                        this.f23495b.a(imageView6, strA2);
                        break;
                    case 5:
                        m.f(view6, "<unused var>");
                        ImageView imageView7 = imageView;
                        m.c(imageView7);
                        this.f23495b.a(imageView7, strA2);
                        break;
                    default:
                        m.f(view6, "<unused var>");
                        ImageView imageView8 = imageView;
                        m.c(imageView8);
                        this.f23495b.a(imageView8, strA2);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view6 = helper.getView(R.id.tv_char_part_2);
        m.e(view6, "getView(...)");
        final int i16 = 5;
        z.b(view6, new c(this) { // from class: dn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleVowelAdapter f23495b;

            {
                this.f23495b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View view7 = (View) obj;
                switch (i16) {
                    case 0:
                        m.f(view7, "<unused var>");
                        ImageView imageView2 = imageView;
                        m.c(imageView2);
                        this.f23495b.a(imageView2, strA3);
                        break;
                    case 1:
                        m.f(view7, "<unused var>");
                        ImageView imageView3 = imageView;
                        m.c(imageView3);
                        this.f23495b.a(imageView3, strA3);
                        break;
                    case 2:
                        m.f(view7, "<unused var>");
                        ImageView imageView4 = imageView;
                        m.c(imageView4);
                        this.f23495b.a(imageView4, strA3);
                        break;
                    case 3:
                        m.f(view7, scNRoQgKSYX.YHpiL);
                        ImageView imageView5 = imageView;
                        m.c(imageView5);
                        this.f23495b.a(imageView5, strA3);
                        break;
                    case 4:
                        m.f(view7, "<unused var>");
                        ImageView imageView6 = imageView;
                        m.c(imageView6);
                        this.f23495b.a(imageView6, strA3);
                        break;
                    case 5:
                        m.f(view7, "<unused var>");
                        ImageView imageView7 = imageView;
                        m.c(imageView7);
                        this.f23495b.a(imageView7, strA3);
                        break;
                    default:
                        m.f(view7, "<unused var>");
                        ImageView imageView8 = imageView;
                        m.c(imageView8);
                        this.f23495b.a(imageView8, strA3);
                        break;
                }
                return b0.f48488a;
            }
        });
        View view7 = helper.getView(R.id.tv_char_part_2_zhuyin);
        m.e(view7, "getView(...)");
        final int i17 = 6;
        z.b(view7, new c(this) { // from class: dn.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DoubleVowelAdapter f23495b;

            {
                this.f23495b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View view8 = (View) obj;
                switch (i17) {
                    case 0:
                        m.f(view8, "<unused var>");
                        ImageView imageView2 = imageView;
                        m.c(imageView2);
                        this.f23495b.a(imageView2, strA3);
                        break;
                    case 1:
                        m.f(view8, "<unused var>");
                        ImageView imageView3 = imageView;
                        m.c(imageView3);
                        this.f23495b.a(imageView3, strA3);
                        break;
                    case 2:
                        m.f(view8, "<unused var>");
                        ImageView imageView4 = imageView;
                        m.c(imageView4);
                        this.f23495b.a(imageView4, strA3);
                        break;
                    case 3:
                        m.f(view8, scNRoQgKSYX.YHpiL);
                        ImageView imageView5 = imageView;
                        m.c(imageView5);
                        this.f23495b.a(imageView5, strA3);
                        break;
                    case 4:
                        m.f(view8, "<unused var>");
                        ImageView imageView6 = imageView;
                        m.c(imageView6);
                        this.f23495b.a(imageView6, strA3);
                        break;
                    case 5:
                        m.f(view8, "<unused var>");
                        ImageView imageView7 = imageView;
                        m.c(imageView7);
                        this.f23495b.a(imageView7, strA3);
                        break;
                    default:
                        m.f(view8, "<unused var>");
                        ImageView imageView8 = imageView;
                        m.c(imageView8);
                        this.f23495b.a(imageView8, strA3);
                        break;
                }
                return b0.f48488a;
            }
        });
    }
}

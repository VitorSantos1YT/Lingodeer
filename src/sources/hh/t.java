package hh;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.drawerlayout.widget.ktFt.FpIL;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.fluent.widget.MultipleTransformer;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends androidx.fragment.app.y {
    public jh.j T;
    public final n9.q S = new n9.q(29, false);
    public final ArrayList U = new ArrayList();

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.S.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.m.f(dialog, "dialog");
        super.onDismiss(dialog);
        ArrayList arrayList = this.U;
        if (arrayList.size() > 1) {
            ry.p.Z(arrayList, new e(1));
        }
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        String str = BuildConfig.VERSION_NAME;
        String str2 = BuildConfig.VERSION_NAME;
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            str2 = ((Object) str2) + ((String) next);
        }
        jh.j jVar = this.T;
        if (jVar == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        ArrayList arrayList2 = (ArrayList) jVar.f36361c.getValue();
        if (arrayList2 != null) {
            if (arrayList2.size() > 1) {
                ry.p.Z(arrayList2, new e(2));
            }
            Iterator it2 = arrayList2.iterator();
            kotlin.jvm.internal.m.e(it2, "iterator(...)");
            while (it2.hasNext()) {
                Object next2 = it2.next();
                kotlin.jvm.internal.m.e(next2, "next(...)");
                str = ((Object) str) + ((String) next2);
            }
        }
        if (kotlin.jvm.internal.m.a(str2, str)) {
            return;
        }
        jh.j jVar2 = this.T;
        if (jVar2 != null) {
            jVar2.f36361c.setValue(arrayList);
        } else {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
    }

    public final void v(View view, ImageView imageView, ImageView imageView2, ViewPager2 viewPager2, EditText editText, ArrayList arrayList) {
        ve.i.B(view);
        imageView.setVisibility(8);
        imageView2.setVisibility(0);
        viewPager2.setVisibility(0);
        if (this.T == null) {
            kotlin.jvm.internal.m.n("viewModel");
            throw null;
        }
        String keyWord = editText.getText().toString();
        kotlin.jvm.internal.m.f(keyWord, "keyWord");
        th.j.a(new ay.x(new jh.i(keyWord, 0)).k(ky.e.f38937b).g(px.b.a()).h(new ob.e(12, arrayList, viewPager2), vx.b.f54316e), this.S);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Object objL;
        final ArrayList arrayList;
        t tVar = this;
        kotlin.jvm.internal.m.f(inflater, "inflater");
        androidx.fragment.app.p0 p0VarRequireActivity = tVar.requireActivity();
        kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
        tVar.T = (jh.j) new ViewModelProvider(p0VarRequireActivity).get(jh.j.class);
        View viewInflate = inflater.inflate(R.layout.dialog_pd_grammar_filter, viewGroup);
        final ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_ok);
        final ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_close);
        FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate.findViewById(R.id.flex_category_tags);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.edt_search);
        final ViewPager2 viewPager2 = (ViewPager2) viewInflate.findViewById(R.id.view_pager);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.iv_search);
        final ArrayList arrayList2 = new ArrayList();
        androidx.fragment.app.p0 p0VarRequireActivity2 = tVar.requireActivity();
        kotlin.jvm.internal.m.e(p0VarRequireActivity2, "requireActivity(...)");
        viewPager2.setAdapter(new ih.b(p0VarRequireActivity2, arrayList2));
        Context contextRequireContext = tVar.requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        viewPager2.setPageTransformer(new MultipleTransformer(viewPager2, j3.Z(32, contextRequireContext)));
        jh.j jVar = tVar.T;
        String str = FpIL.JZiGItF;
        if (jVar == null) {
            kotlin.jvm.internal.m.n(str);
            throw null;
        }
        ArrayList arrayList3 = (ArrayList) jVar.f36361c.getValue();
        ArrayList arrayList4 = tVar.U;
        if (arrayList3 != null) {
            arrayList4.addAll(arrayList3);
        }
        jh.j jVar2 = tVar.T;
        if (jVar2 == null) {
            kotlin.jvm.internal.m.n(str);
            throw null;
        }
        ArrayList arrayList5 = jVar2.f36360b;
        HashSet hashSet = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList5.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = size;
            Object obj = arrayList5.get(i11);
            i11++;
            ArrayList arrayList7 = arrayList5;
            if (hashSet.add((String) obj)) {
                arrayList6.add(obj);
            }
            size = i12;
            arrayList5 = arrayList7;
        }
        int size2 = arrayList6.size();
        int i13 = 0;
        while (i13 < size2) {
            int i14 = i13 + 1;
            final String str2 = (String) arrayList6.get(i13);
            kotlin.jvm.internal.m.c(flexboxLayout);
            int i15 = size2;
            View viewInflate2 = tVar.getLayoutInflater().inflate(R.layout.item_pd_filter_tag, (ViewGroup) flexboxLayout, false);
            kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
            final TextView textView = (TextView) viewInflate2;
            View view = viewInflate;
            try {
                objL = tVar.getString(tVar.requireContext().getResources().getIdentifier(str2, "string", tVar.requireContext().getPackageName()));
            } catch (Throwable th2) {
                objL = com.bumptech.glide.e.l(th2);
            }
            if (objL instanceof qy.n) {
                arrayList = arrayList4;
            } else {
                textView.setText((String) objL);
                flexboxLayout.addView(textView);
                if (arrayList4.contains(str2)) {
                    textView.setBackgroundResource(R.drawable.bg_item_pd_tag_selected);
                    Context contextRequireContext2 = tVar.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                    textView.setTextColor(contextRequireContext2.getColor(R.color.color_393939));
                } else {
                    textView.setBackgroundResource(R.drawable.bg_item_pd_tag);
                    Context contextRequireContext3 = tVar.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                    textView.setTextColor(contextRequireContext3.getColor(R.color.color_7D7D7D));
                }
                final int i16 = 0;
                ArrayList arrayList8 = arrayList4;
                final t tVar2 = tVar;
                arrayList = arrayList8;
                bq.z.b(textView, new fz.c() { // from class: hh.r
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        Context contextRequireContext4;
                        int i17;
                        Context contextRequireContext5;
                        int i18;
                        View it = (View) obj2;
                        switch (i16) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                ArrayList arrayList9 = arrayList;
                                String str3 = str2;
                                boolean zContains = arrayList9.contains(str3);
                                TextView textView2 = textView;
                                t tVar3 = tVar2;
                                if (zContains) {
                                    arrayList9.remove(str3);
                                    textView2.setBackgroundResource(R.drawable.bg_item_pd_tag);
                                    contextRequireContext4 = tVar3.requireContext();
                                    i17 = R.color.color_7D7D7D;
                                } else {
                                    arrayList9.add(str3);
                                    textView2.setBackgroundResource(R.drawable.bg_item_pd_tag_selected);
                                    contextRequireContext4 = tVar3.requireContext();
                                    i17 = R.color.color_393939;
                                }
                                ep.a.z(contextRequireContext4, "requireContext(...)", i17, textView2);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                ArrayList arrayList10 = arrayList;
                                String str4 = str2;
                                boolean zContains2 = arrayList10.contains(str4);
                                TextView textView3 = textView;
                                t tVar4 = tVar2;
                                if (zContains2) {
                                    arrayList10.remove(str4);
                                    textView3.setBackgroundResource(R.drawable.bg_item_pd_tag);
                                    contextRequireContext5 = tVar4.requireContext();
                                    i18 = R.color.color_7D7D7D;
                                } else {
                                    arrayList10.add(str4);
                                    textView3.setBackgroundResource(R.drawable.bg_item_pd_tag_selected);
                                    contextRequireContext5 = tVar4.requireContext();
                                    i18 = R.color.color_393939;
                                }
                                ep.a.z(contextRequireContext5, "requireContext(...)", i18, textView3);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
                final int i17 = 1;
                bq.z.b(textView, new fz.c() { // from class: hh.r
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        Context contextRequireContext4;
                        int i18;
                        Context contextRequireContext5;
                        int i19;
                        View it = (View) obj2;
                        switch (i17) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                ArrayList arrayList9 = arrayList;
                                String str3 = str2;
                                boolean zContains = arrayList9.contains(str3);
                                TextView textView2 = textView;
                                t tVar3 = this;
                                if (zContains) {
                                    arrayList9.remove(str3);
                                    textView2.setBackgroundResource(R.drawable.bg_item_pd_tag);
                                    contextRequireContext4 = tVar3.requireContext();
                                    i18 = R.color.color_7D7D7D;
                                } else {
                                    arrayList9.add(str3);
                                    textView2.setBackgroundResource(R.drawable.bg_item_pd_tag_selected);
                                    contextRequireContext4 = tVar3.requireContext();
                                    i18 = R.color.color_393939;
                                }
                                ep.a.z(contextRequireContext4, "requireContext(...)", i18, textView2);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                ArrayList arrayList10 = arrayList;
                                String str4 = str2;
                                boolean zContains2 = arrayList10.contains(str4);
                                TextView textView3 = textView;
                                t tVar4 = this;
                                if (zContains2) {
                                    arrayList10.remove(str4);
                                    textView3.setBackgroundResource(R.drawable.bg_item_pd_tag);
                                    contextRequireContext5 = tVar4.requireContext();
                                    i19 = R.color.color_7D7D7D;
                                } else {
                                    arrayList10.add(str4);
                                    textView3.setBackgroundResource(R.drawable.bg_item_pd_tag_selected);
                                    contextRequireContext5 = tVar4.requireContext();
                                    i19 = R.color.color_393939;
                                }
                                ep.a.z(contextRequireContext5, "requireContext(...)", i19, textView3);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
            }
            arrayList4 = arrayList;
            size2 = i15;
            i13 = i14;
            tVar = this;
            viewInflate = view;
        }
        final View view2 = viewInflate;
        editText.setOnFocusChangeListener(new com.google.android.material.datepicker.c(imageView3, 1));
        editText.addTextChangedListener(new s(imageView3, 0));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hh.q
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i18, KeyEvent keyEvent) {
                if (i18 != 3) {
                    return true;
                }
                View view3 = view2;
                kotlin.jvm.internal.m.c(view3);
                ImageView imageView4 = imageView;
                kotlin.jvm.internal.m.c(imageView4);
                ImageView imageView5 = imageView2;
                kotlin.jvm.internal.m.c(imageView5);
                ViewPager2 viewPager3 = viewPager2;
                kotlin.jvm.internal.m.c(viewPager3);
                EditText editText2 = editText;
                kotlin.jvm.internal.m.c(editText2);
                this.f32279a.v(view3, imageView4, imageView5, viewPager3, editText2, arrayList2);
                return true;
            }
        });
        kotlin.jvm.internal.m.c(imageView3);
        bq.z.b(imageView3, new dl.d(this, view2, imageView, imageView2, viewPager2, editText, arrayList2, 1));
        kotlin.jvm.internal.m.c(imageView);
        bq.z.b(imageView, new gr.s(this, 2));
        kotlin.jvm.internal.m.c(imageView2);
        bq.z.b(imageView2, new b0.a(viewPager2, imageView, imageView2, editText, 14));
        Dialog dialog = this.N;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.requestFeature(1);
            window.setWindowAnimations(R.style.MissionPopAnimation);
        }
        return view2;
    }
}

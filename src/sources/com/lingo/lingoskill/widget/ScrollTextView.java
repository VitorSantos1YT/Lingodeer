package com.lingo.lingoskill.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;
import java.util.List;
import py.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScrollTextView extends LinearLayout {
    public final int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f22140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f22141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f22142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f22144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f22145f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22146t;

    public ScrollTextView(Context context) {
        this(context, null);
    }

    public List<String> getList() {
        return this.f22145f;
    }

    public void setList(List<String> list) {
        this.f22145f = list;
        if (list.size() > 1) {
            list.add(list.get(0));
        }
    }

    public ScrollTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22143d = false;
        this.f22146t = 0;
        this.H = 100;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.widget_scroll_text_layout, this);
        this.f22140a = (TextView) viewInflate.findViewById(R.id.tv_banner1);
        this.f22141b = (TextView) viewInflate.findViewById(R.id.tv_banner2);
        this.f22142c = new Handler();
        this.f22144e = new b(this, 11);
    }
}

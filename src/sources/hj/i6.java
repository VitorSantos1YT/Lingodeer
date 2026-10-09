package hj;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckBox f32725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f32726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckBox f32727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EditText f32728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f32730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f32731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RelativeLayout f32732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RelativeLayout f32733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RelativeLayout f32734l;
    public final LinearLayout m;

    public i6(RelativeLayout relativeLayout, MaterialButton materialButton, CheckBox checkBox, LinearLayout linearLayout, CheckBox checkBox2, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout2) {
        this.f32723a = relativeLayout;
        this.f32724b = materialButton;
        this.f32725c = checkBox;
        this.f32726d = linearLayout;
        this.f32727e = checkBox2;
        this.f32728f = editText;
        this.f32729g = imageView;
        this.f32730h = imageView2;
        this.f32731i = imageView3;
        this.f32732j = relativeLayout2;
        this.f32733k = relativeLayout3;
        this.f32734l = relativeLayout4;
        this.m = linearLayout2;
    }

    public static i6 a(View view) {
        int i11 = R.id.btn_send;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(view, R.id.btn_send);
        if (materialButton != null) {
            i11 = R.id.check_box_accept_answer;
            CheckBox checkBox = (CheckBox) fr.j3.q(view, R.id.check_box_accept_answer);
            if (checkBox != null) {
                i11 = R.id.check_box_content;
                LinearLayout linearLayout = (LinearLayout) fr.j3.q(view, R.id.check_box_content);
                if (linearLayout != null) {
                    i11 = R.id.check_box_other;
                    CheckBox checkBox2 = (CheckBox) fr.j3.q(view, R.id.check_box_other);
                    if (checkBox2 != null) {
                        i11 = R.id.edit_bug_report;
                        EditText editText = (EditText) fr.j3.q(view, R.id.edit_bug_report);
                        if (editText != null) {
                            i11 = R.id.iv_back;
                            ImageView imageView = (ImageView) fr.j3.q(view, R.id.iv_back);
                            if (imageView != null) {
                                i11 = R.id.iv_bug_report_screen_short;
                                ImageView imageView2 = (ImageView) fr.j3.q(view, R.id.iv_bug_report_screen_short);
                                if (imageView2 != null) {
                                    i11 = R.id.iv_screen_short_full;
                                    ImageView imageView3 = (ImageView) fr.j3.q(view, R.id.iv_screen_short_full);
                                    if (imageView3 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        i11 = R.id.rl_bug_title_bar;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) fr.j3.q(view, R.id.rl_bug_title_bar);
                                        if (relativeLayout2 != null) {
                                            i11 = R.id.rl_screen_short_full;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) fr.j3.q(view, R.id.rl_screen_short_full);
                                            if (relativeLayout3 != null) {
                                                i11 = R.id.share_content;
                                                LinearLayout linearLayout2 = (LinearLayout) fr.j3.q(view, R.id.share_content);
                                                if (linearLayout2 != null) {
                                                    return new i6(relativeLayout, materialButton, checkBox, linearLayout, checkBox2, editText, imageView, imageView2, imageView3, relativeLayout, relativeLayout2, relativeLayout3, linearLayout2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32723a;
    }
}

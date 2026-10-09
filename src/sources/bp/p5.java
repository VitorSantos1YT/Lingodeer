package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p5 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p5 f4761a = new p5(1, hj.c1.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityUpdateLessonBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_update_lesson, (ViewGroup) null, false);
        int i11 = R.id.btn_ad;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_ad);
        if (materialButton != null) {
            i11 = R.id.btn_change_billing_page_model;
            MaterialButton materialButton2 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_change_billing_page_model);
            if (materialButton2 != null) {
                i11 = R.id.btn_change_model;
                MaterialButton materialButton3 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_change_model);
                if (materialButton3 != null) {
                    i11 = R.id.btn_clear_review_data;
                    MaterialButton materialButton4 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_clear_review_data);
                    if (materialButton4 != null) {
                        i11 = R.id.btn_debug;
                        MaterialButton materialButton5 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_debug);
                        if (materialButton5 != null) {
                            i11 = R.id.btn_debug_sentence_model;
                            MaterialButton materialButton6 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_debug_sentence_model);
                            if (materialButton6 != null) {
                                i11 = R.id.btn_debug_story;
                                MaterialButton materialButton7 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_debug_story);
                                if (materialButton7 != null) {
                                    i11 = R.id.btn_debug_word_model;
                                    MaterialButton materialButton8 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_debug_word_model);
                                    if (materialButton8 != null) {
                                        i11 = R.id.btn_filter_number_sentence;
                                        MaterialButton materialButton9 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_filter_number_sentence);
                                        if (materialButton9 != null) {
                                            i11 = R.id.btn_fix_user_review;
                                            if (((MaterialButton) fr.j3.q(viewInflate, R.id.btn_fix_user_review)) != null) {
                                                i11 = R.id.btn_generate_unit_info;
                                                MaterialButton materialButton10 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_generate_unit_info);
                                                if (materialButton10 != null) {
                                                    i11 = R.id.btn_get_AF_data;
                                                    if (((MaterialButton) fr.j3.q(viewInflate, R.id.btn_get_AF_data)) != null) {
                                                        i11 = R.id.btn_move_sd;
                                                        if (((MaterialButton) fr.j3.q(viewInflate, R.id.btn_move_sd)) != null) {
                                                            i11 = R.id.btn_mp3;
                                                            MaterialButton materialButton11 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_mp3);
                                                            if (materialButton11 != null) {
                                                                i11 = R.id.btn_no_login;
                                                                MaterialButton materialButton12 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_no_login);
                                                                if (materialButton12 != null) {
                                                                    i11 = R.id.btn_only_one_test;
                                                                    MaterialButton materialButton13 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_only_one_test);
                                                                    if (materialButton13 != null) {
                                                                        i11 = R.id.btn_open_all;
                                                                        MaterialButton materialButton14 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_open_all);
                                                                        if (materialButton14 != null) {
                                                                            i11 = R.id.btn_open_all_alphabet;
                                                                            MaterialButton materialButton15 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_open_all_alphabet);
                                                                            if (materialButton15 != null) {
                                                                                i11 = R.id.btn_output_de;
                                                                                MaterialButton materialButton16 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_output_de);
                                                                                if (materialButton16 != null) {
                                                                                    i11 = R.id.btn_output_ko_syllable_character;
                                                                                    MaterialButton materialButton17 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_output_ko_syllable_character);
                                                                                    if (materialButton17 != null) {
                                                                                        i11 = R.id.btn_remote_url_test;
                                                                                        MaterialButton materialButton18 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_remote_url_test);
                                                                                        if (materialButton18 != null) {
                                                                                            i11 = R.id.btn_test_billing_url;
                                                                                            MaterialButton materialButton19 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_test_billing_url);
                                                                                            if (materialButton19 != null) {
                                                                                                i11 = R.id.btn_test_nbo;
                                                                                                MaterialButton materialButton20 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_test_nbo);
                                                                                                if (materialButton20 != null) {
                                                                                                    i11 = R.id.btn_update_character;
                                                                                                    MaterialButton materialButton21 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_update_character);
                                                                                                    if (materialButton21 != null) {
                                                                                                        i11 = R.id.btn_update_jp_syllable_character;
                                                                                                        MaterialButton materialButton22 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_update_jp_syllable_character);
                                                                                                        if (materialButton22 != null) {
                                                                                                            i11 = R.id.btn_update_ko_syllable_character;
                                                                                                            MaterialButton materialButton23 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_update_ko_syllable_character);
                                                                                                            if (materialButton23 != null) {
                                                                                                                i11 = R.id.btn_update_lesson;
                                                                                                                MaterialButton materialButton24 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_update_lesson);
                                                                                                                if (materialButton24 != null) {
                                                                                                                    i11 = R.id.btn_word_pic_test;
                                                                                                                    MaterialButton materialButton25 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_word_pic_test);
                                                                                                                    if (materialButton25 != null) {
                                                                                                                        i11 = R.id.check_key_word_video;
                                                                                                                        MaterialButton materialButton26 = (MaterialButton) fr.j3.q(viewInflate, R.id.check_key_word_video);
                                                                                                                        if (materialButton26 != null) {
                                                                                                                            i11 = R.id.check_sentence_video;
                                                                                                                            MaterialButton materialButton27 = (MaterialButton) fr.j3.q(viewInflate, R.id.check_sentence_video);
                                                                                                                            if (materialButton27 != null) {
                                                                                                                                i11 = R.id.check_setup_complete;
                                                                                                                                MaterialButton materialButton28 = (MaterialButton) fr.j3.q(viewInflate, R.id.check_setup_complete);
                                                                                                                                if (materialButton28 != null) {
                                                                                                                                    i11 = R.id.clear_material;
                                                                                                                                    MaterialButton materialButton29 = (MaterialButton) fr.j3.q(viewInflate, R.id.clear_material);
                                                                                                                                    if (materialButton29 != null) {
                                                                                                                                        i11 = R.id.copy_fcm;
                                                                                                                                        MaterialButton materialButton30 = (MaterialButton) fr.j3.q(viewInflate, R.id.copy_fcm);
                                                                                                                                        if (materialButton30 != null) {
                                                                                                                                            i11 = R.id.fb_share_btn;
                                                                                                                                            MaterialButton materialButton31 = (MaterialButton) fr.j3.q(viewInflate, R.id.fb_share_btn);
                                                                                                                                            if (materialButton31 != null) {
                                                                                                                                                i11 = R.id.google_plus_share_btn;
                                                                                                                                                MaterialButton materialButton32 = (MaterialButton) fr.j3.q(viewInflate, R.id.google_plus_share_btn);
                                                                                                                                                if (materialButton32 != null) {
                                                                                                                                                    i11 = R.id.jp_char_update;
                                                                                                                                                    MaterialButton materialButton33 = (MaterialButton) fr.j3.q(viewInflate, R.id.jp_char_update);
                                                                                                                                                    if (materialButton33 != null) {
                                                                                                                                                        i11 = R.id.ko_char_update;
                                                                                                                                                        MaterialButton materialButton34 = (MaterialButton) fr.j3.q(viewInflate, R.id.ko_char_update);
                                                                                                                                                        if (materialButton34 != null) {
                                                                                                                                                            i11 = R.id.ll_debug_kr_material;
                                                                                                                                                            LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_debug_kr_material);
                                                                                                                                                            if (linearLayout != null) {
                                                                                                                                                                i11 = R.id.ll_debug_video_test;
                                                                                                                                                                LinearLayout linearLayout2 = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_debug_video_test);
                                                                                                                                                                if (linearLayout2 != null) {
                                                                                                                                                                    i11 = R.id.oss_test;
                                                                                                                                                                    MaterialButton materialButton35 = (MaterialButton) fr.j3.q(viewInflate, R.id.oss_test);
                                                                                                                                                                    if (materialButton35 != null) {
                                                                                                                                                                        i11 = R.id.out_put_lesson_desc;
                                                                                                                                                                        MaterialButton materialButton36 = (MaterialButton) fr.j3.q(viewInflate, R.id.out_put_lesson_desc);
                                                                                                                                                                        if (materialButton36 != null) {
                                                                                                                                                                            i11 = R.id.status_bar_view;
                                                                                                                                                                            View viewQ = fr.j3.q(viewInflate, R.id.status_bar_view);
                                                                                                                                                                            if (viewQ != null) {
                                                                                                                                                                                i11 = R.id.switch_debug_kr_material;
                                                                                                                                                                                MaterialSwitch materialSwitch = (MaterialSwitch) fr.j3.q(viewInflate, R.id.switch_debug_kr_material);
                                                                                                                                                                                if (materialSwitch != null) {
                                                                                                                                                                                    i11 = R.id.switch_debug_video_test;
                                                                                                                                                                                    MaterialSwitch materialSwitch2 = (MaterialSwitch) fr.j3.q(viewInflate, R.id.switch_debug_video_test);
                                                                                                                                                                                    if (materialSwitch2 != null) {
                                                                                                                                                                                        i11 = R.id.test_it_model_3;
                                                                                                                                                                                        MaterialButton materialButton37 = (MaterialButton) fr.j3.q(viewInflate, R.id.test_it_model_3);
                                                                                                                                                                                        if (materialButton37 != null) {
                                                                                                                                                                                            i11 = R.id.test_ui_json;
                                                                                                                                                                                            MaterialButton materialButton38 = (MaterialButton) fr.j3.q(viewInflate, R.id.test_ui_json);
                                                                                                                                                                                            if (materialButton38 != null) {
                                                                                                                                                                                                return new hj.c1((NestedScrollView) viewInflate, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6, materialButton7, materialButton8, materialButton9, materialButton10, materialButton11, materialButton12, materialButton13, materialButton14, materialButton15, materialButton16, materialButton17, materialButton18, materialButton19, materialButton20, materialButton21, materialButton22, materialButton23, materialButton24, materialButton25, materialButton26, materialButton27, materialButton28, materialButton29, materialButton30, materialButton31, materialButton32, materialButton33, materialButton34, linearLayout, linearLayout2, materialButton35, materialButton36, viewQ, materialSwitch, materialSwitch2, materialButton37, materialButton38);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}

function fish_prompt

  set -x PATH $HOME/bin $PATH

  if type -q starship
    starship init fish | source
  end

  set black 333333
  set red EE7762
  set green A9DC76
  set yellow FFD866
  set blue 409CFF
  set purple a89fec
  set cyan 70D7FF
  set white F9F6EF
  set grey 646464
  set orange EE9B70
  set bright_pink ED005C
  set bright_orange FD971F
  set bright_black b3b3b3
  set bright_red F25022
  set bright_green 92D923
  set bright_yellow FFB900
  set bright_blue 00A4EF
  set bright_purple 9478F6
  set bright_cyan 4DDFEA
  set bright_white FFFFFF
  set background 191919
  set foreground E1E1E1
  set cursor_color ED005C
  set selection_background 1E3C50

  set fish_color_autosuggestion $yellow
  set fish_color_cancel $white
  set fish_color_command $bright_green
  set fish_color_comment $grey
  set fish_color_cwd $cyan
  set fish_color_cwd_root $bright_cyan
  set fish_color_end $bright_pink
  set fish_color_error $red
  set fish_color_escape $bright_purple
  set fish_color_history_current $bright_cyan
  set fish_color_host $green
  set fish_color_host_remote $bright_orange
  set fish_color_match $blue
  set fish_color_normal $bright_white
  set fish_color_operator $bright_red
  set fish_color_param $purple
  set fish_color_quote $bright_yellow
  set fish_color_redirection $bright_pink
  set fish_color_search_match --background=$grey
  set fish_color_selection $bright_cyan
  set fish_color_status $orange
  set fish_color_user $bright_orange
  set fish_color_valid_path $bright_blue
  set fish_pager_color_completion $bright_white
  set fish_pager_color_description --background=$grey
  set fish_pager_color_prefix $bright_purple
  set fish_pager_color_progress $cyan

end

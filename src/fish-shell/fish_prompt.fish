function fish_prompt

  set -x PATH $HOME/bin $PATH

  if type -q starship
    starship init fish | source
  end

  set black 323130
  set red ff638a
  set green b7e66e
  set yellow ffd866
  set blue 409cff
  set purple b6b3eb
  set cyan 8edce5
  set white dfdedd
  set grey 8f8e8d
  set orange EE9B70
  set bright_pink ed005c
  set bright_red f25022
  set bright_orange ff8c00
  set bright_black b3b3b3
  set bright_green 92d923
  set bright_yellow ffb900
  set bright_cyan 57d1eb
  set bright_blue 0078d7
  set bright_purple 9380ff
  set bright_white fffefd
  set background 171615
  set foreground cfcecd
  set cursor_color 00b294
  set selection_background 525150

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

bossbar set bio_break:timer value 0
scoreboard players set bio_break bio_break 1
schedule function bio_break:time_increase 10s

execute if score bio_break bio_break matches 1 run tag @a add bioBreak
execute if score bio_break bio_break matches 0 run tag @a remove bioBreak

execute as @a[tag=bioBreak] run effect give @s legolib:invulnerable 600 0 true